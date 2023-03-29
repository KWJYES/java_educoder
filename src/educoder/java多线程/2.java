package step2;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
// ---------------------Begin------------------------
//tips: 输出语句为：Thread.currentThread().getName()+"的call()方法在运行"
//定义一个实现Callable接口的实现类，类名必须命名为MyThread_callable
class MyThread_callable implements Callable<Object> {
    @Override
    public Object call() throws Exception {
        for (int i = 0; i < 5; i ++)
        System.out.println(Thread.currentThread().getName() + "的call()方法在运行");
        return Thread.currentThread().getName();
    }
}

// ---------------------End------------------------
public class CallableExample {
    public static void main(String[] args) throws InterruptedException,
            ExecutionException {
        // 创建Callable接口的实现类对象
        MyThread_callable myThread3 = new MyThread_callable();
        // 使用FutureTask封装Callable接口
        FutureTask<Object> ft1 = new FutureTask<>(myThread3);
        // 使用Thread(Runnable target ,String name)构造方法创建线程对象
        Thread thread1 = new Thread(ft1, "thread1");
        // 创建并启动另一个线程thread2
        FutureTask<Object> ft2 = new FutureTask<>(myThread3);
        Thread thread2 = new Thread(ft2, "thread2");
        // ---------------------Begin------------------------
        // 调用线程对象的start()方法启动线程
        thread1.start();
        thread2.start();

        // 可以通过FutureTask对象的方法管理返回值
        Object result1 = ft1.get();
        Object result2 = ft2.get();
        System.out.println("thread1返回结果:" + result1);
        System.out.println("thread2返回结果:" + result2);
        // ---------------------End------------------------
    }
}
