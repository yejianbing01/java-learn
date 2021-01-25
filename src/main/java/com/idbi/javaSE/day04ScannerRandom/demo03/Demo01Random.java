package cn.study.day04ScannerRandom.demo03;

import java.util.Random;

/*
Random类用来生成随机数字。使用起来也是三个步骤：

1. 导包
import java.util.Random;

2. 创建
Random r = new Random();

3. 使用
获取一个随机的int数字（范围是int所有范围，有正负）：int num = r.nextInt();
获取一个随机的int数字（参数代表了范围，左闭右开区间）：int num = r.nextInt(3); // [0,3)
 */
public class Demo01Random {

    public static void main(String[] args) {
        Random r = new Random();

//        int num = r.nextInt();
//        System.out.println("随机数是：" + num);
//
//        int num1 = r.nextInt(3);
//        System.out.println(num1);

        // 获取变量[1,n]区间的随机数
        for (int i = 0; i < 100; i++) {
            int num2 = r.nextInt(3) + 1;
            System.out.println("随机数是：" + num2);
        }

    }

}
