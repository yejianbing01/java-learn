package com.idbi.thread;

/**
 * 多线程
 * 三种创建方式：
 * 1. 继承Thread类
 * 2. 实现Runnable接口
 * 3. 实现Callable接口
 */
public class TestThread1 extends Thread{

    @Override
    public void run() {
        // run方法线程体
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程");

        }
    }

    public static void main(String[] args) {
        //主线程
        // 创建一个线程对象
        TestThread1 testThread1 = new TestThread1();
        // start()开启线程
        testThread1.start();


        for (int i = 0; i < 200; i++) {
            System.out.println("主线程");
        }
    }




}
