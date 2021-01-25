package cn.study.day03Class.demo01;

public class Demo02Student {
  public static void main(String[] args) {
      Student stu = new Student();
      stu.setName("迪丽热巴");
      stu.setAge(18);
      stu.setMale(false);

      System.out.println(stu.getAge());
      System.out.println(stu.getName());
      System.out.println(stu.isMale());
  }
}
