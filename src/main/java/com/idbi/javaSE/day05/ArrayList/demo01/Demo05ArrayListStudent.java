package cn.study.day05.ArrayList.demo01;


import java.util.ArrayList;

/*
题目：
自定义4个学生对象，添加到集合并遍历
 */
public class Demo05ArrayListStudent {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = new Student("迪丽热巴", 18);
        Student stu2 = new Student("stu2", 12);
        Student stu3 = new Student("stu3", 15);
        Student stu4 = new Student("stu4", 15);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

}
