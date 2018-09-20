package base.thread;

import java.util.concurrent.TimeUnit;

public class InterruputThread2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                try {
                    while(!Thread.interrupted()){
                        System.out.println("Sleep");
                        TimeUnit.SECONDS.sleep(2);
                    }
                } catch (InterruptedException e) {
                    System.out.println("Interruted When Sleep");
                    boolean interrupt=this.isInterrupted();
                    //中断状态被复位
                    System.out.println("interruted:"+interrupt);
                }
            }
        };
        t1.start();
        TimeUnit.SECONDS.sleep(2);
        t1.interrupt();
    }
}
