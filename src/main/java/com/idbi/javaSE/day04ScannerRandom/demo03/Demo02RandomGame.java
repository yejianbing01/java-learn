package cn.study.day04ScannerRandom.demo03;

import java.util.Random;
import java.util.Scanner;

/*
猜数字大小

1. 生成随机数
2. 获取键盘输入
3. 比较数字大小
 */
public class Demo02RandomGame {

    public static void main(String[] args) {
        int r = new Random().nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int guessNum;

        while (true) {
            System.out.print("请输入你猜测的数字：");
            guessNum = sc.nextInt();
            if (r > guessNum) {
                System.out.println("你输入的数字太小了");
            } else if (r < guessNum) {
                System.out.println("你输入的数字太大了");
            } else {
                System.out.println("恭喜你，猜对了!! \n游戏结束！");
                break;
            }
        }
    }

}
