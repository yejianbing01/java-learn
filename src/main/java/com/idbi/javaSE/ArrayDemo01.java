package com.idbi.javaSE;

import java.util.Arrays;

/**
 * @author idbi
 * 1. 数组
 */
public class ArrayDemo01 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] array1 = {1,2,3,4,5};

        array[0] = 1;
        for (int j : array) {
            System.out.println(j);
        }

        Arrays.fill(array, 1);
        System.out.println(Arrays.toString(array));

    }
}
