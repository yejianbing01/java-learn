package cn.study.day05.ArrayList.demo01;

import java.util.ArrayList;

/*
数组的长度不可变
但是ArrayList集合的长度是可以随意变化的。

对于ArrayList来说，有一个尖括号<E>代表泛型
泛型：也就是装在集合当中的所有元素，全都是统一的什么类型
注意：泛型只能是引用类型，不能是基本类型

ArrayList 当中常用的方法有：
public boolean add(E e): 向集合中添加元素，参数的类型和泛型一致
public E get(int index): 从集合中获取元素，参数是索引编号，返回值是对应位置的元素
public E remove(int index): 从集合中删除元素，返回被删除的元素
public int size(): 获取数组的长度
 */
public class Demo01ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("迪丽热巴");
        list.add("马尔扎哈");

        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.size());
        System.out.println(list.remove(0));
        System.out.println(list);

        System.out.println("=====================");
        ArrayList<String> list1 = new ArrayList<>();

    }
}
