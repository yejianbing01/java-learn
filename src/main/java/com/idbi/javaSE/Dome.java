package com.idbi.javaSE;

public class Dome {

    public static void main(String[] args) {
        int[] list1 = {5,554654,234,53,7656,4,2,6,7,87,4};
        sort(list1);
        for (int i = 0; i < list1.length; i++) {
            System.out.println(list1[i]);
        }
    }

    public void print3(){
        for (int i = 0; i < 5; i++) {
            for(int j = 0; j <= 5 - i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 0; j <= i -1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void sort(int[] list){
        for (int i = 0; i < list.length; i++) {
            for (int i1 = 0; i1 < list.length - i -1; i1++) {
                int temp;
                if (list[i1] < list[i1 + 1]){
                    temp = list[i1];
                    list[i1] = list[i1 + 1];
                    list[i1 + 1] = temp;
                }
            }
        }
    }
}
