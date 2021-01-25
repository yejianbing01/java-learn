package cn.study.day03Class.demo02;

/*
 * 构造方法：是专门用来创建对象的方法，当我通过关键字new 来创建对象时，其实就是在调用构造方法。
 * 注意事项：
 * 1. 构造方法的名称必须和所在的类名称完全一致，
 * 2. 构造方法没有返回值，连void都不写
 * 3. 如果没有编写构造方法，编译器将会默认赠送一个构造方法，没有参数和方法体，什么事情都不做。
 * 4. 一旦编写了至少一个构造方法，编译器将不再赠送。
 * 5. 构造方法也是可以重载的
 */
public class Student {
    private String name;
    private int age;

    public Student(){
        System.out.println("无参构造方法执行了");
    }

    public Student(String name,int age){
        System.out.println("全参构造方法执行了");
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }


    public void show(){
        System.out.println("姓名：" + name + ", 年龄：" + age);
    }
}
