package com.idbi.thread;

/**
 * @author yejianbing
 */
public class ThreadSetPriority implements Runnable{
    // Thread.setPriority 设置线程优先级
    // 线程优先级为 1-10

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "优先级= " +  Thread.currentThread().getPriority());
    }


    public static void main(String[] args){
        ThreadSetPriority threadSetPriority = new ThreadSetPriority();
        Thread thread1 = new Thread(threadSetPriority, "thread1");
        Thread thread2 = new Thread(threadSetPriority, "thread2");
        Thread thread3 = new Thread(threadSetPriority, "thread3");
        Thread thread4 = new Thread(threadSetPriority, "thread4");
        Thread thread5 = new Thread(threadSetPriority, "thread5");

        thread2.setPriority(1);
        thread3.setPriority(10);
        thread4.setPriority(Thread.MAX_PRIORITY);
        thread5.setPriority(Thread.MIN_PRIORITY);
        thread5.setPriority(Thread.NORM_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

    }



}
