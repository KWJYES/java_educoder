package educoder.Java面向对象_Java中的异常.第2关_捕获异常;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        /********* Begin *********/
        try {
            System.out.println(num1 / num2);
        } catch (ArithmeticException e) {
            System.out.print("除数不能为0");

        }
        /********* End *********/
    }

}
