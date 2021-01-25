package cn.study.day03Class.demo02;

public class Demo02Student {
  public static void main(String[] args) {
      Student stu1 = new Student();
      Student stu2 = new Student("迪丽热巴",18);
      stu2.show();
      stu2.setAge(19);
      stu2.show();
  }


}
