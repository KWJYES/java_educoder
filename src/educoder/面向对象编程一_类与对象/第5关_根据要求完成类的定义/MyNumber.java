package educoder.面向对象编程一_类与对象.第5关_根据要求完成类的定义;

public class MyNumber {
    private int number;

    public MyNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static void swap(MyNumber num1, MyNumber num2){
        int temp=num1.getNumber();
        num1.setNumber(num2.getNumber());
        num2.setNumber(temp);
    }
}
