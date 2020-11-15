package com.idbi.thread;

/**
 * 多个线程同时操作一个对象
 * 买火车票的例子, 线程不安全
 * 每个线程都有自己的运行内存
 *
 */
public class ThreadTicket implements Runnable {
    private int ticketNum = 10;
    boolean flag = true;

    @Override
    public void run() {
        while (flag){
            buy();
        }
    }

    /**
     * synchronized 同步方法 锁的是this
     */
    public synchronized void buy(){
        if(ticketNum <= 0) {
            flag = false;
            return;
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "拿到了第 " + ticketNum-- + " 张票");
    }

    public static void main(String[] args) {
        ThreadTicket ticket = new ThreadTicket();
        new Thread(ticket,"用户1").start();
        new Thread(ticket,"用户2").start();
        new Thread(ticket,"用户3").start();
    }

}
