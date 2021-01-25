package cn.study.day01.demo01;

/*
 * 数组的特点：
 * 1.数组是一种引用类型
 * 2.数组中的多个数据，类型必须统一
 * 3.数组的长度在运行期间不允许改变
 *
 * 两种常见的初始化方式
 * 1.动态初始化（指定长度）
 * 2.静态初始化（指定内容）
 */
public class Demo01Array {

  public static void main(String[] args) {
    // 动态初始化
    int[] arrayA = new int[10];
    String[] arrayB = new String[20];

    // 静态初始化
    int[] arrayC = new int[] {1, 2, 3};
    String[] arrayD = new String[] {"Hello", "World"};

    // 静态初始化省略格式
    int[] arrayF = {1, 2, 3};

    // 访问数组元素
    System.out.println(arrayF); // 输出数组内存地址hash值


  }
}
