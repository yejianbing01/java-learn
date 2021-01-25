package cn.study.day03Class.demo02;

/*
 * 通过谁调用的方法，this就是谁
 */
public class Person {
    String name;

    public void sayHello(String name){
        System.out.println(name + ", 你好。我是：" + this.name);
    }
}
