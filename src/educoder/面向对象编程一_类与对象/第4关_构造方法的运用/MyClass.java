package educoder.面向对象编程一_类与对象.第4关_构造方法的运用;

public class MyClass {
    public int m1=2;

    public void showMemberInfo() {
        System.out.printf("m1=%d\n",m1);
    }
    //begin

    public MyClass() {
        System.out.println("object constructing...");
        System.out.println("constructing finished!");
    }

    public MyClass(int m1) {
        this.m1 = m1;
    }

    //end
}
