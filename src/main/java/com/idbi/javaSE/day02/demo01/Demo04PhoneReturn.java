package cn.study.day02.demo01;

public class Demo04PhoneReturn {
  public static void main(String[] args) {
    Phone apple = getPhone();
    System.out.println(apple.brand);
    System.out.println(apple.price);
    System.out.println(apple.color);
  }

  public static Phone getPhone(){
      Phone one = new Phone();
      one.brand = "apple";
      one.price = 8999.0;
      one.color = "黑色";
      return one;
  }

}
