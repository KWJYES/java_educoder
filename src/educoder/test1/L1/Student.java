package educoder.test1.L1;

public class Student {
    public String number;//学号
    public String name;//姓名
    public double usualScores;//平时成绩
    public double experimentScores;//实验成绩
    public double finalScores;//期末考试成绩
    public double totalScores;//最终成绩
    public char level;

    public void updateGrade() {
        totalScores =0.3*usualScores+0.3*experimentScores+0.4*finalScores;
        if(totalScores>=90) level='A';
        else if (totalScores>=80) level='B';
        else if (totalScores>=70) level='C';
        else if (totalScores>=60) level='D';
        else level='E';
    }

    public void outputInfo() {
        System.out.printf("学号=姓名=平时成绩=实验成绩=期末考试=%s(%s)的课程\"Java面向对象程序设计\"的成绩评定如下:\n" +
                "平时成绩:%.2f\n" +
                "实验成绩:%.2f\n" +
                "期末考试:%.2f\n" +
                "总评:%.2f,等级:%c",name,number,usualScores,experimentScores,finalScores,totalScores,level);
    }
}

