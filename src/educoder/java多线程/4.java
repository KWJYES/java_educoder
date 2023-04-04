package step4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicket extends Thread {
    //多线程共享资源,票数为30张
    public static int ticketnums = 30;
    private static final Lock lock = new ReentrantLock();
    // ---------------------Begin------------------------
    @Override
    public void run() {
        while (true) {

            if(SellTicket.ticketnums <= 0){
                break;
            }
            SellTicket.lock.lock();
            if(SellTicket.ticketnums==1){
            System.out.println(String.format("卖出了第%d张票",SellTicket.ticketnums));
            ticketnums--;
            System.out.println("票卖完了");

            }
            else if(SellTicket.ticketnums>1){
            System.out.println(String.format("卖出了第%d张票",SellTicket.ticketnums));
            ticketnums--;

            }
            SellTicket.lock.unlock();
        }
    }
    // ---------------------End------------------------
}
