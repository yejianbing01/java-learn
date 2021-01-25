package cn.study.day07.Static;

/*
一旦使用static修饰成员方法，name这就成为了静态方法。静态方法不属于对象，属于类本身。

如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它
如果有了static关键字，那么不需要创建对象，直接就能通过将类名称来使用它
 */
public class Demo02StaticMethod {

    public static void main(String[] args) {
        MyClass obj = new MyClass();

        obj.method();
        obj.staticMethod(); //不推荐，这种写法在编译以后也会被javac编译成MyClass.staticMethod()
        MyClass.staticMethod();
    }



}
