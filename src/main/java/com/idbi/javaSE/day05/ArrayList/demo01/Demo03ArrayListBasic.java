package cn.study.day05.ArrayList.demo01;


import java.util.ArrayList;

/*
如果希望向集合ArrayList中存储基本数据类型，必须使用基本类型对应的"包装类"

基本类型    包装类(引用类型，包装类都位于java.lang包下)
byte        Byte
short       Short
int         Integer   【特殊】
long        Long
float       Float
double      Double
char        Character 【特殊】
boolean     Boolean


从JDK 1.5+开始，支持自动装箱，自动拆箱

自动装箱：基本类型 --> 包装类型
自动拆箱：包装类型 --> 基本类型
 */
public class Demo03ArrayListBasic {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
