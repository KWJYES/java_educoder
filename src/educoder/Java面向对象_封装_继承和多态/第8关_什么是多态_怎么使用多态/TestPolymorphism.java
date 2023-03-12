package educoder.Java面向对象_封装_继承和多态.第8关_什么是多态_怎么使用多态;

public class TestPolymorphism {
    public static void main(String[] args) {
        // 以多态方式分别实例化子类对象并调用eat()方法
        /********* begin *********/
        Dog dog = new Dog();
        dog.eat();
        Cat cat = new Cat();
        cat.eat();
        Lion lion = new Lion();
        lion.eat();
        /********* end *********/
    }
}

// Animal类中定义eat()方法
class Animal {
    /********* begin *********/
    public void eat() {

    }
    /********* end *********/
}

// Dog类继承Animal类 复写eat()方法
class Dog extends Animal {
    /********* begin *********/
    @Override
    public void eat() {
        System.out.println("eating bread...");
    }
    /********* end *********/
}

// Cat类继承Animal类 复写eat()方法
class Cat extends Animal {
    /********* begin *********/
    @Override
    public void eat() {
        System.out.println("eating rat...");
    }
    /********* end *********/
}

// Lion类继承Animal类 复写eat()方法
class Lion extends Animal {
    /********* begin *********/
    @Override
    public void eat() {
        System.out.println("eating meat...");
    }
    /********* end *********/
}
