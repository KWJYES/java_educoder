package educoder.test1.L1;

import java.util.Scanner;

public class MainClass {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        // `T`O`D`O Auto-generated method stub
        Student stu=new Student();
        //从控制台输入学生信息
        Teacher.inputInfo(stu,sc);
        //根据输入的学生信息进行处理：计算总评成绩及对应等级
        stu.updateGrade();
        //输出处理后的结果
        stu.outputInfo();
        sc.close();
    }

}
