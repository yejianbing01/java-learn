package com.idbi.thread;

/**
 * 多个线程同时操作一个对象
 * 买火车票的例子
 */
public class TestThread04 implements Runnable {
    private int ticketNum = 10;

    public void run() {
        while (true){
            if(ticketNum <= 0) {
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "拿到了第 " + ticketNum-- + " 张票");
        }
    }

    public static void main(String[] args) {
        TestThread04 ticket = new TestThread04();
        new Thread(ticket,"用户1").start();
        new Thread(ticket,"用户2").start();
        new Thread(ticket,"用户3").start();
    }

}
