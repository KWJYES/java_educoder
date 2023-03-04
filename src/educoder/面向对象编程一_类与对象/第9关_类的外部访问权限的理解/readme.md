1、

下列关于Java类的外部访问权限的说法，正确的有 **ABD**

A、
外部访问权限的合理设计，有利于类使用的安全性和方便性

B、
外部访问权限的控制，是通过public. protected. private等几个关键字来设置的

C、
某个类DemoClass的名称前没有加public关键字，则其他类都不能直接引用DemoClass

D、
加了private关键字的方法成员或数据成员，是不能在该成员所在的类体以外任何地方直接访问的，连当前类的子类也不能直接访问

2、

要设计一个名为“MyClass”的类，它包含数据成员“member1”和“member2”、方法成员“func1”和“func2”，希望：任何其他类（包括子类）都不能直接读写“member1”，只有同一个包中的类可以直接读写“member2”，子类不能继承“member2”；任何其他类都可以调用“func1”，而只有同一个包中的类以及MyClass的子类可以直接调用“func2”，则“MyClass”、“member1”、“member2”、“func1”、“func2”前面的权限控制关键字分别为 **D**

A、
public, 不加关键字，private，public, protected

B、
public, private, 不加关键字，protected, public

C、
public, protected, 不加关键字，public, private

D、
public, private, 不加关键字，public, protected