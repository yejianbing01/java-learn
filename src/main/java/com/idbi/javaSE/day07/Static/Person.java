package cn.study.day07.Static;

public class Person {
    static{
        System.out.println("静态代码块执行了");
    }

    public Person() {
        System.out.println("构造方法执行了");
    }
}
