package com.idbi.thread;

/**
 * Thread.join  线程加入，其他线程阻塞
 * Thread.yield 线程礼让
 * Thread.state 线程状态
 */
public class TestJoin implements Runnable{

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("join");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TestJoin testJoin = new TestJoin();
        Thread thread = new Thread(testJoin);
        thread.start();

        for (int j = 0; j < 20; j++) {
            if (j == 10){
                thread.join();
            }
            System.out.println("主线程");
        }
    }

}
