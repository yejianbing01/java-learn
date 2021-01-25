package cn.study.day02.demo01;

public class Demo02PhoneTwo {
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

    one.call("雷布斯");
    one.sendMessage();
    System.out.println("==============");

    Phone two = one;
    System.out.println(two.brand);
    System.out.println(two.color);
    System.out.println(two.price);

    two.call("雷布斯");
    two.sendMessage();
    System.out.println("==============");

  }


}
