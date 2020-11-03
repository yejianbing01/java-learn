package com.idbi.thread;

/**
 * 创建线程方式2：实现Runnable接口创建多线程
 */
public class TestThread03 implements Runnable {

    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("子线程");
        }
    }

    public static void main(String[] args) {
        // 创建Runnable接口的实现类对象
        TestThread03 t = new TestThread03();
        // 创建线程对象，通过线程对象来开启我们的线程代理
        new Thread(t).start();

        for (int i = 0; i < 200; i++) {
            System.out.println("主线程");
        }
    }


}
