package cn.study.day03Class.demo01;

public class Demo01Person {
  public static void main(String[] args) {
      Person p = new Person();
      p.name = "迪丽热巴";
//      p.age = -18; // 直接访问private 修饰的变量是错误的
      p.setAge(-18);
      p.show();
  }
}
