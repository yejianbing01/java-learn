package cn.study.day06.String.demo01;


/*
字符串常量池：程序当中直接写上双引号的字符串，就在字符串常量池中。

对于基本数据类型来说，==是进行数值的比较
对于引用数据类型来说，==是进行【内存地址值】比较
 */
public class Demo02StringPool {

    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a','b', 'c'};
        String str3 = new String(charArray);

        byte[] byteArray = {97,98,99};
        String str4 = new String(byteArray);

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str3);
        System.out.println(str1 == str4);
        System.out.println(str3 == str4);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

    }

}
