package educoder.Java面向对象_封装_继承和多态.第6关_final关键字的理解与使用;
public class finalTest {
    public static void main(String args[]) {
        Bike1 obj = new Bike1();
        obj.run();

        Honda honda = new Honda();
        honda.run();

        Yamaha yamaha = new Yamaha();
        yamaha.run();
    }
}
//不可以修改 final 变量的值
// final方法,不可以重写
//// 不可以扩展 final 类
//请在此添加你的代码
/********** Begin *********/
class Bike1 {
    final int speedlimit = 120;

    void run() {
        System.out.println("speedlimit=120");
    }

}

class Bike2 {
    final void run() {
        System.out.println("running");
    }
}

class Honda{
    void run() {
        System.out.println("running safely with 100kmph");
    }

}

final class Bike3 {
}

class Yamaha{
    void run() {
        System.out.println("running safely with 100kmph");
    }

}
/********** End **********/
