package com.idbi.thread;

public class TestThread05 implements Runnable {
    public static String winner = null;

    @Override
    public void run(){

        for (int i = 0; i <= 100; i++) {
            if(end(i)) break;
            if(Thread.currentThread().getName().equals("兔子") && i % 10 == 0){
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "跑了" + i + "步");
        }
    }


    public Boolean end(int step){
        if(winner != null){
            return true;
        }else if (step >= 100){
            System.out.println("winner is " + Thread.currentThread().getName());
            winner = Thread.currentThread().getName();
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        TestThread05 t = new TestThread05();
        new Thread(t, "兔子").start();
        new Thread(t, "乌龟").start();
    }


}
