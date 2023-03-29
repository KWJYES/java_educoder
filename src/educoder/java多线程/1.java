package step1;

public class CreateThreadPractice {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        // ---------------------Begin------------------------
        //开启线程
        myThread.start();

        // ---------------------End------------------------
    }
}
// ---------------------Begin------------------------
//继承Thread编写名为MyThead的类，代码内容为循环输出10遍: 线程在运行......
class MyThread extends Thread {

@Override
public void run() {
    for (int i = 0; i < 10; i++) {
        System.out.println("线程在运行......");
    }
}
}

// ---------------------End------------------------

