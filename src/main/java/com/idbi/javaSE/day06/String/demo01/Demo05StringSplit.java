package cn.study.day06.String.demo01;

/*
分割字符串的方法：
public String[] split(String regex):按照参数的规则，将字符串切分成若干部分。

注意事项：
split方法的参数其实是一个【正则表达式】
如果按照英文句点"."进行切分，必须写"\\."进行转义

 */
public class Demo05StringSplit {

    public static void main(String[] args) {

        String[] stringArray = "a,b,c,d".split(",");
        System.out.println(stringArray);
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }

        System.out.println("================");

        String[] array = "a.b.c.d".split("\\.");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }

}
