package com.idbi.thread;

/**
 * @author yejianbing
 */
public class ThreadYield implements Runnable{
    // Thread.yield 线程礼让

    public static void main(String[] args) {
        ThreadYield threadYield = new ThreadYield();

        Thread thread1 = new Thread(threadYield, "线程1");
        Thread thread2 = new Thread(threadYield, "线程2");
        Thread thread3 = new Thread(threadYield, "线程3");
        
        thread1.start();
        thread2.start();
        thread3.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() +  "i= " + i);
            if(5 == i){
                Thread.yield();
                System.out.println("执行yield, 当前线程为" + Thread.currentThread().getName());
            }

        }
    }

}
