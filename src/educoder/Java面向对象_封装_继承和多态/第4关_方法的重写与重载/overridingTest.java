package educoder.Java面向对象_封装_继承和多态.第4关_方法的重写与重载;

public class overridingTest {
    public static void main(String[] args) {
        // 实例化子类对象s，调用talk()方法打印信息
        /********* begin *********/
        Student student=new Student("张三",18,"哈佛大学");
        System.out.print(student.talk());
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

    public String talk(){
        return "我是："+this.name+"，今年："+this.age+"岁";
    }
    /********* end *********/
}

class Student extends Person {
    /********* begin *********/
    private String school;
    public Student(String name, int age,String school) {
        super(name, age);
        this.school=school;
    }

    @Override
    public String talk() {
        return super.talk()+"，我在"+this.school+"上学";
    }

    /********* end *********/
}
