package com.idbi.thread;

/**
 * 观察线程状态
 */
public class TestState {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // 新生状态
        Thread.State state =  thread.getState();
        System.out.println(state);

        // 就绪状态
        thread.start();
        System.out.println(thread.getState());

        while(state != Thread.State.TERMINATED){
            Thread.sleep(100);
            state = thread.getState();
            System.out.println(state);
        }

    }
}
