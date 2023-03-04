1、

public class Test{
public static void swap(Integer a,Integer b) {
Integer c=a;
a=b;
b=c;
}
public static void main(String[]args){
Integer a=3;
Integer b=4;
swap(a,b);
System.out.println(a+”，”+b);
}
}
请问上述代码的执行结果怎样？（请注意，通过这个例子，要总结出基本数据类型进行类封装后，对象变量到底表示的是值，还是对象的引用）。（**A**）

A、
3,4

B、
3,3

C、
4,4

D、
4,3

2、

以下Java代码正确的有 **DE**

A、
Int a=5;

B、
Bool t=true;

C、
Byte a=123；Char b=‘A’;

D、
double a=10.34; Double b=a;

E、
Float a=3.1415f;

3、

以下有关字符串与数值间的相互转换的代码，正确的有 **ABDE**

A、
int e=Integer.valueOf("1234");

B、
Float e= Float.valueOf("1234");

C、
String s1=4;

D、
String s1=String.valueOf(4);

E、
Double a=4.6;String s1=a.toString();