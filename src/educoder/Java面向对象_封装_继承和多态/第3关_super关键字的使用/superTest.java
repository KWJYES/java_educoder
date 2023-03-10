package educoder.Java面向对象_封装_继承和多态.第3关_super关键字的使用;

public class superTest {
    public static void main(String[] args) {
        // 实例化一个Student类的对象s，为Student对象s中的school赋值，打印输出信息
        /********* begin *********/
        Student student=new Student("张三",18);
        student.setSchool("哈佛大学");
        System.out.printf("姓名：%s，年龄：%d，学校：%s",student.getName(),student.getAge(),student.getSchool());
        /********* end *********/
    }
}

class Person {
    /********* begin *********/
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    /********* end *********/
}

class Student extends Person {
    /********* begin *********/
    private String school;

    public Student(String name, int age) {
        super(name, age);
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getName() {
        return super.getName();
    }

    public int getAge() {
        return super.getAge();
    }
    /********* end *********/
}

