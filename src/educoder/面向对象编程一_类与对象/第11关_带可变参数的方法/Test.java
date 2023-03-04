package educoder.面向对象编程一_类与对象.第11关_带可变参数的方法;

public class Test {
    public static void main(String[] args) {
        //求两个数的均值
        System.out.printf("%.2f\n",Test.getAve(2,3));
        //求三个数的均值
        System.out.printf("%.2f",Test.getAve(2,3,4));
    }
    //请在1、2处补充代码，不允许在其他地方修改或添加代码
    public static double getAve(int...args) {
        int total=0;
        for (int a:args)
            total+=a;
        return (float)total/args.length;
    }
}
