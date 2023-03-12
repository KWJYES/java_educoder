package educoder.Java面向对象_封装_继承和多态.第7关_接口;

public class interfaceTest {
    public static void main(String[] args) {
        // 实例化一Student的对象s，并调用talk()方法，打印信息
        /********* begin *********/
        Student s = new Student();
        s.talk();
        /********* end *********/

    }
}

// 声明一个Person接口，并在里面声明三个常量：name、age和occupation，并分别赋值，声明一抽象方法talk()
interface Person {
    /********* begin *********/
    final String name = "张三";
    final int age = 18;
    final String occupation = "学生";

    abstract void talk();

    abstract String getName();

    abstract int getAge();

    abstract String getOccupation();
    /********* end *********/
}

// Student类继承自Person类 复写talk()方法返回姓名、年龄和职业信息
class Student implements Person {
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getOccupation() {
        return occupation;
    }

    /********* begin *********/

    @Override
    public void talk() {
        System.out.println(getOccupation() + "——>姓名：" + getName() + "，年龄：" + getAge() + "，职业：" + getOccupation() + "！");
    }
    /********* end *********/
}