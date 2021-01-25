package cn.study.day01.demo01;

/**
 * 1.基本数据类型
 * 整数型 byte(-128~127) short(-32768~32767) int(-2^31~2^31-1) long(-2^63~2^63-1) 默认int，需要用long，需要加一个后缀L
 * 浮点型 float double(默认) 需用用float,需要加一个后缀F
 * 字符型 char (0~65536)
 * 浮点型 boolean (true,false)
 */
public class Demo01 {
    public static void main(String[] args) {
        // 左边申明的数据类型取值范围比右边大的时候 将会发生自动类型转换
        byte b = 1;
        short s = 100;
        int i = 1000;
        long l = 10000L;

        float f = 3.14F;
        double d = 1.1;

        char c = 'A';
        boolean bo1 = true;
        boolean bo2 = false;

        // 强制类型转换
        byte x = (byte) 200;
        int num = (int) 100L;
        int num1 = (byte) 3.99;
        System.out.println(x);
        System.out.println(num1);

        // byte/short/char 参与属性运算的时候会转换为 int
        char z = 'A';
        System.out.println(z + 1);

    }


}
