package cn.study.day02.demo01;

public class Demo03PhoneParam {
  public static void main(String[] args) {
    Phone apple = new Phone();
    apple.brand = "apple";
    apple.price = 8999.0;
    apple.color = "土豪金";

    method(apple);
  }

  public static void method(Phone param){
    System.out.println(param.brand);
    System.out.println(param.price);
    System.out.println(param.color);
  }

}
