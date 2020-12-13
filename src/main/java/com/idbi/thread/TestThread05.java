package com.idbi.thread;

/**
 * 龟兔赛跑
 */
public class TestThread05 implements Runnable {
    public static String winner = null;

    @Override
    public void run(){

        for (int i = 0; i <= 100; i++) {
            if(gameOver(i)){
                break;
            }
            // 模拟兔子休息
            if("兔子".equals(Thread.currentThread().getName()) && i % 10 == 1){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "跑了" + i + "步");
        }
    }

    /**
     * 判断比赛是否结束
     * @param step 跑了第几步
     * @return Boolean
     */
    public Boolean gameOver(int step){
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
