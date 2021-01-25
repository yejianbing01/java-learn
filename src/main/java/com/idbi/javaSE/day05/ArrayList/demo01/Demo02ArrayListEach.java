package cn.study.day05.ArrayList.demo01;

import java.util.ArrayList;

public class Demo02ArrayListEach {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }

}
