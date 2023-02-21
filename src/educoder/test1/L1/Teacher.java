package educoder.test1.L1;

import java.util.Scanner;

public class Teacher {
    public static void inputInfo(Student stu, Scanner sc) {
        stu.number=sc.nextLine();
        stu.name=sc.nextLine();
        stu.usualScores=sc.nextDouble();
        stu.experimentScores=sc.nextDouble();
        stu.finalScores=sc.nextDouble();
    }
}
