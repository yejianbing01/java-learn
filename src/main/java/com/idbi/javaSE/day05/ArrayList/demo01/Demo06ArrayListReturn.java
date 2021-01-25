package cn.study.day05.ArrayList.demo01;

import java.util.ArrayList;
import java.util.Random;

/*
题目：
大集合存入20个随机数字，筛选出其中的偶数添加到小集合中，并返回小集合
 */
public class Demo06ArrayListReturn {

    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            bigList.add(r.nextInt(101));
        }

        System.out.println(getSmallArrayList(bigList));


    }

    /**
     * 返回偶数集合
     *
     * @param bigList
     * @return
     */
    public static ArrayList<Integer> getSmallArrayList(ArrayList<Integer> bigList) {
        ArrayList<Integer> smallList = new ArrayList<>();

        for (int i = 0; i < bigList.size(); i++) {
            int tmp = bigList.get(i);
            if (tmp % 2 == 0) {
                smallList.add(tmp);
            }
        }
        return smallList;
    }

}
