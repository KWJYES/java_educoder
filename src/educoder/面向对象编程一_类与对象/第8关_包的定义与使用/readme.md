1、

下列关于Java包的说法，不正确的有**BDE**

A、
Java标准库、第三方的商业类库，都是按包的方式来管理众多的类

B、
Java标准库中的某些类，如Math类，在使用时，不必使用import语句导入，是因为这些类所在的包为匿名包

C、
开发大型应用程序时，利用包的机制管理好大量自定义的类，是一个值得推荐的做法

D、
用户声明的包可以分层次，例如“cn.guet”是一个具有2个层级的包，它要求在应用程序顶层目录下有对应的二级子目录：“cn\guet”，这个包下的类，例如cn.guet.ClassA，编译后对应的class文件，则不一定非要放到guet子目录下。

E、
同一个包中的类所在的源文件没有必要存入同一个目录，只需要文件开头有相同的package声明语句就可以了。

2、

下列关于Java包的用法，不正确的有 **BC**

A、
多个源文件中开头有声明语句”package imagan.file;”，表示这些源文件中定义的类都隶属于imagan.file这个包。

B、
源文件“ClassA.java”和源文件“ClassB.java”中都有一条声明语句“package guet.myclass;”，且ClassA关联于ClassB,则在ClassA.java文件中必须有import guet.myclass.ClassB或 import guet.myclass.*语句。

C、
已知类classA位于cn包中，而classB位于cn.test包中，则在classA的定义中，要引用classB，可以使用“import test;”语句（test前面的cn.可以省略）。

D、
在某个源文件中要使用位于不同包中的两个类，而这两个类的类名是相同的，为了向编译器指明当前要使用的类，有必要在类名前加包名前缀。

3、

程序中要用到第三方Java扩展库中的某个类DemoClass,该类位于包guet.imagan中，则在需要用到该类的源文件中可以加入的语句，正确的有：**BD**

A、
package guet.imagan.DemoClass;

B、
import guet.imagan.*;

C、
from guet.imagan import DemoClass;

D、
import guet.imagan.DemoClass;