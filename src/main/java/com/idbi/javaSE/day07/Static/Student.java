package cn.study.day07.Static;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Student {
    private String name; // 姓名
    private int age; // 年龄
    static String room; // 班级
    private int id; // 学号
    private static int idCounter = 0; // 计数器

    public Student() {
        this.id = ++idCounter;
    }

    public Student(String name, int age) {
        this.id = ++idCounter;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}