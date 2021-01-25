package cn.study.day02.demo01;

public class Demo01PhoneOne {
  public static void main(String[] args) {
    // 根据phone类创建名为one的对象
    Phone one = new Phone();
    System.out.println(one.brand);
    System.out.println(one.color);
    System.out.println(one.price);
    System.out.println("=============");

    one.brand = "apple";
    one.color = "绿色";
    one.price = 8999.0;

    System.out.println(one.brand);
    System.out.println(one.color);
    System.out.println(one.price);
    System.out.println("=============");

    one.call("雷布斯");
    one.sendMessage();
  }


}
