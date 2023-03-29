package step3;
// ---------------------Begin------------------------
//定义一个实现Runnable接口的实现类，类名必须命名为MyThread_runable
//tips: 输出语句为：Thread.currentThread().getName()+"的run()方法在运行"
class MyThread_runable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i ++)
        System.out.println(Thread.currentThread().getName() + "的run()方法在运行");
    }
}
// ---------------------End------------------------

