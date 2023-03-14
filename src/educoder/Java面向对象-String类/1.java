package step1;

import java.util.Scanner;

public class Roster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /********** Begin *********/
        String s = scanner.nextLine();
        System.out.println(s.length());
        String s1 = scanner.nextLine();
        System.out.println(s1.length());
        System.out.println(s.compareTo(s1)==0?"相同":"不相同");


        /********** End *********/
    }
}
