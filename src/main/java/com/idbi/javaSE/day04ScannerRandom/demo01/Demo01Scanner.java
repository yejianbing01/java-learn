package cn.study.day04ScannerRandom.demo01;

import java.util.Scanner;

/*
Scanner :获取键盘输入

引用类型的一半使用步骤：

1. 导包
import 包路径.类名称;
只有java.lang包下的内容不需要导包，其他的包都需要import语句

2. 创建
类名称 对象名 = new 类名称();

3. 使用
对象名.成员方法();

获取键盘输入的int数字：int num = sc.nextInt();
获取键盘输入的字符串：String str = sc.next();

 */
public class Demo01Scanner {

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); // System.in 代表从键盘输入

      System.out.print("请输入一个数字>>>");
      int num = sc.nextInt();
      System.out.println("输入的数字是：" + num);

      System.out.print("请输入一个字符串>>>");
      String str = sc.next();
      System.out.println("输入的字符串是：" + str);
  }
}
