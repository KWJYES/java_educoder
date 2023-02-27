package educoder.Java语言基础综合实训_1.第7关_Scanner的使用;


/********* Begin *********/

import java.util.Scanner;//注意导入Scanner类

public class HelloWorld {
    public static void main(String[] args) {
        String name;
        int age;
        char sex;
        double weight;
        String address;
        boolean married;
        Scanner scan = new Scanner(System.in);

        System.out.println("请录入嫦娥个人信息：");
        System.out.println("请输入姓名：");
        name = scan.next();
        System.out.println("请输入年龄：");
        age = scan.nextInt();
        System.out.println("请输入性别：");
        sex = scan.next().charAt(0);
        System.out.println("请输入体重：");
        weight = scan.nextDouble();
        System.out.println("请输入地址：");
        address = scan.next();
        System.out.println("请输入是否已婚：");
        married = scan.next().equals("是");

        System.out.printf("信息如下：\n" +
                "\t姓名：%s\n" +
                "\t年龄：%d岁\n" +
                "\t性别：%c\n" +
                "\t体重：%.1fkg\n" +
                "\t地址：%s\n" +
                "\t婚否：%c\n", name, age, sex, weight, address, married ? '是' : '否');

        /********* End *********/
    }
}