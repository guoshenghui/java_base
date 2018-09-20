package base.thread;

import java.util.concurrent.TimeUnit;

public class InterruputThread1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                while (true) {
                    if (this.isInterrupted()){
                        System.out.println("线程中断");
                        break;
                    }
                }
                System.out.println("已跳出循环，线程中断");
            }
        };
        t1.start();
        TimeUnit.SECONDS.sleep(2);
        t1.interrupt();
    }
}
