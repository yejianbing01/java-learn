package com.idbi.thread;

import java.util.concurrent.*;
import java.util.concurrent.Executors;

/**
 * 线程创建方式三：实现Callable接口
 */
public class TestThread06 implements Callable<Boolean> {
    @Override
    public Boolean call(){
        for (int i = 0; i < 20; i++) {
            System.out.println("实现Callable接口的子线程");
        }
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestThread06 testThread06 = new TestThread06();
        // 创建执行服务
        ExecutorService service = Executors.newFixedThreadPool(3);
        // 提交执行
        Future<Boolean> r1 = service.submit(testThread06);
        // 获取结果
        boolean result1 = r1.get();
        // 关闭服务
        service.shutdownNow();
    }

}
