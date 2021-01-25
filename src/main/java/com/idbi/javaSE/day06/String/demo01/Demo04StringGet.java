package cn.study.day06.String.demo01;

/*
String当中与获取相关的常用方法：

public int length(): 获取字符串当中含有的字符个数，拿到字符串长度。
public String concat(String str): 将当前字符串和参数字符串拼接成为返回值新的字符串。
public char charAt(int index): 获取指定索引位置的单个字符。
public int indexOf(String str): 查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值。
 */
public class Demo04StringGet {
    public static void main(String[] args) {
        // 获取字符串长度
        int length = "fkahfhohvoa".length();
        System.out.println("字符串长度是：" + length);

        // 拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        // 获取指定位置的单个字符
        char ch = "Hello".charAt(1);
        System.out.println("在1号索引位置的字符是：" + ch);

        // 获取指定字符串在本字符串中的索引位置
        int index = "Hello World".indexOf("llo");
        System.out.println("llo在字符串中的索引位置是：" + index);


    }

}
