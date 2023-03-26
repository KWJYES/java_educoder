package educoder.Java面向对象_String类.第2关_substring方法与indexOf方法的使用_姓名查找;

import java.util.Scanner;

public class NameSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /********** Begin *********/
        String txt = scanner.nextLine();
        String name = scanner.nextLine();
        int i;
        int a=0;
        while ((i=txt.indexOf(name))!=-1){
            System.out.println(i+a);
            a+=i+name.length();
            txt = txt.substring(i+name.length());
        }
        /********** End *********/
    }
}
