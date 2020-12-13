package com.idbi.thread;

/**
 * 模拟倒计时
 */
public class TestSleep {

    public static void tenDown() throws InterruptedException{
        int num = 10;
        while (num > 0) {
            Thread.sleep(1000);
            System.out.println(num);
            num--;
        }
    }

    public static void main(String[] args) {
        try {
            TestSleep.tenDown();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
