package cn.study.day06.String.demo01;

import java.util.Scanner;

/*
题目：
键盘输入一个字符串，并且统计其中各种字符出现的次数。
种类有：大写字母、小写字母、数字、其他
 */
public class Demo07StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String input = sc.next();

        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i]>='A' && charArray[i] <= 'Z'){
                countUpper++;
            }else if(charArray[i] >= 'a' && charArray[i] <= 'z'){
                countLower++;
            }else if(charArray[i] >= '0' && charArray[i] <= '9'){
                countNumber++;
            }else {
                countOther++;
            }
        }

        System.out.println("大写字母个数= " + countUpper);
        System.out.println("小写字母个数= " + countLower);
        System.out.println("数字个数= " + countNumber);
        System.out.println("其他字符个数= " + countOther);

    }
}
