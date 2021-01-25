package cn.study.day01.demo01;

/**
 * 四则运算符
 * 加 +
 * 减 -
 * 乘 *
 * 除 /
 * 取模(取余) %
 * 自增 ++num num++  单独使用前++和后++没有任何区别
 * 自减 --num num--  和赋值使用的时候，前++先+1再赋值 后++先赋值后++
 */
public class Demo02Calc {
    public static void main(String[] args) {
        System.out.println(1 + 1);
        System.out.println(2 - 1);
        System.out.println(3 * 2);
        System.out.println(7 / 2);
        System.out.println(7 % 2);

        char str = 'A';
        System.out.println(str + 1);

        String str1 = "java";
        System.out.println(str1 + 1);
    }
}
