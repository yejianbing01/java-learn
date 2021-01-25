package cn.study.day07.Static;

/*
1. 静态不能直接访问非静态。
原因：因为在内存中是【先】有的静态内容【后】有的非静态内容。
2. 静态方法不能使用this。
原因：this代表当前对象，通过谁调用的方法，谁就是当前对象。【静态方法和对象没关系】
 */
public class MyClass {

    int num; // 成员变量
    static int numStatic; // 静态变量

    // 成员方法
    public void method(){
        System.out.println("这是一个成员方法。");
        // 成员方法可以访问成员变量
        System.out.println(num);
        // 成员方法可以访问静态变量
        System.out.println(numStatic);
    }

    // 静态方法
    public static void staticMethod(){
        System.out.println("这是一个静态方法");
        // 静态方法可以访问静态变量
        System.out.println(numStatic);
        // 静态方法不能访问成员变量
        // System.out.println(num);
    }

}
