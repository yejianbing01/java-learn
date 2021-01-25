package cn.study.day06.String.demo01;


/*
== 是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用两个方法：
public boolean equals(Object obj): 参数可以是任何对象，只有参数是一个字符串且内容相同才返回true；否则返回false
注意事项：
1. 任何对象都能用Object接收。
2. equals方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样。
3. 如果双方一个是变量一个是常量，建议把常量写在前面

public boolean equalsIgnoreCase(String str): 忽略大小写，进行内容比较
 */
public class Demo03StringEquals {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a', 'b', 'c'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals("abc"));
        System.out.println("abc".equals(str1));

        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equals(strB));
        System.out.println(strA.equalsIgnoreCase(strB));
    }

}
