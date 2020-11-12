package com.idbi.thread;

/**
 * @author yejianbing
 */
public class ThreadDaemon implements Runnable{
    // thread.setDaemon 设置线程为守护线程
    // 守护线程在jvm停止后自动停止

    public static void main(String[] args) {
        ThreadDaemon threadDaemon = new ThreadDaemon();

        Thread thread = new Thread(threadDaemon, "守护线程");

        thread.setDaemon(true);
        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("主线程");
        }

    }

    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
