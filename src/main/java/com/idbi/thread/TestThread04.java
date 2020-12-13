package com.idbi.thread;


/**
 * 多个线程操作同一个对象
 * 线程不安全
 * 购买火车票的例子
 */
public class TestThread04 implements Runnable {
    // 票数
    private int ticketNum = 10;

    @Override
    public void run() {
        while(ticketNum >0){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-->拿到了第"+ ticketNum + "张票");
            ticketNum--;
        }
    }

    public static void main(String[] args) {
        // 启用三个线程购买火车票
        TestThread04 testThread04 = new TestThread04();
        new Thread(testThread04,"用户1").start();
        new Thread(testThread04,"用户2").start();
        new Thread(testThread04,"用户3").start();
    }

}
