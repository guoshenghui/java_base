package base.thread;

import java.util.concurrent.TimeUnit;

public class SynchronizedBlocked implements  Runnable{

    public synchronized void f(){
        System.out.println("Trying to call f()");
        while(true){//Never releases lock
            Thread.yield();
        }
    }

    /**
     * 在构造器中创建新线程并启动获取锁对象
     */
    public SynchronizedBlocked(){
        new Thread(){
            @Override
            public void run() {
                f();//Lock acquired by this thread
            }
        }.start();
    }

    @Override
    public void run() {
        //中断判断
        while (true){
            if (Thread.interrupted()){
                System.out.println("中断线程！");
                break;
            }else{
                f();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException{
        SynchronizedBlocked sync=new SynchronizedBlocked();
        Thread thread=new Thread(sync);
        //启动后调用f()方法，无法获取实例锁处于等待状态
        thread.start();
        TimeUnit.SECONDS.sleep(2);
        //中断线程，无法生效
        thread.interrupt();
    }


}
