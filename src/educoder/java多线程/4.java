package step4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicket extends Thread {
    //多线程共享资源,票数为30张
    public static int ticketnums = 30;
    // ---------------------Begin------------------------
  
    private final Lock lock = new ReentrantLock();

    public void run(){
        while(true){
            lock.lock();
            if(ticketnums>0) {
                try{
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName()
                    +" 正在发售第"+ticketnums--+"张票");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally{
                    lock.unlock();
                }
            } else {
                lock.unlock();
                break;
            }
        }
    }
    // ---------------------End------------------------
}
