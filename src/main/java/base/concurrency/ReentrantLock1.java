package base.concurrency;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * 单线程可以重复进入，但必须重复退出
 * @ClassName: ReentrantLock1
 *
 * @date: 2018年3月12日 上午11:01:46
 */
public class ReentrantLock1 implements Runnable {
	private static int a = 0;
	ReentrantLock lock = new ReentrantLock();

	@Override
	public void run() {
		for (int i = 0; i < 10000000; i++) {
			lock.lock();
			lock.lock();
			try {
				a++;
			} finally {
				lock.unlock();
				lock.unlock();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ReentrantLock1 rt = new ReentrantLock1();
		Thread t1 = new Thread(rt);
		Thread t2 = new Thread(rt);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(a);
	}

}
