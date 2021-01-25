package cn.study.day01.demo01;

/*
 定义一个方法的格式 修饰符 返回值类型 方法名称(){方法体}
 方法命名规则：小驼峰 return 后面的返回值类型 必须和方法名称前面的返回值类型一致
 方法重载：
 1.参数个数不同
 2.参数类型不同
 3.参数的多类型顺序不同
*/
public class Demo03Method {
  public static void main(String[] args) {
    method();
    sum(1, 2);
    sum(1, 2, 3);
  }

  public static void method() {
    System.out.println("方法体");
  }

  public static int sum(int a, int b) {
    return a + b;
  }

  public static int sum(int a, int b, int c) {
    return a + b + c;
  }
}
