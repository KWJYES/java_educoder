package educoder.Java面向对象_Java中的异常.第4关_自定义异常;

import java.util.Scanner;

public class Task {
    /********* Begin *********/
    public static void main(String[] args) throws MyException {
        Scanner sc = new Scanner(System.in);
        String username = sc.next();

        //判断用户名
        if (username.length() < 3) {
            throw new MyException("用户名小于三位Exception");
        } else {
            System.out.print("用户名格式正确");
        }

    }
}

class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}

/********* End *********/
