package cn.study.day06.String.demo01;

/*
String当中与转换相关的常用方法有：

public char[] toCharArray(): 将字符串拆分成字符数组作为返回值
public byte[] getBytes(): 获取当前字符串底层的字节数组
public String replace(CharSequence oldString, CharSequence newString):
将所有出现的老字符串替换为新的字符串，返回替换之后的结果新字符串
 */
public class Demo06StringConvert {

    public static void main(String[] args) {
        // 转换为字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars);
        System.out.println(chars.length);
        System.out.println("===========");

        // 转换为字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("============");

        // 字符串的内容替换
        String str1 = "HelloWorld".replace("llo","xxx");
        System.out.println(str1);
    }

}
