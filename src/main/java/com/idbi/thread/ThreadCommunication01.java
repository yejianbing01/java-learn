package com.idbi.thread;

import java.util.Arrays;

/**
 * 解决线程通信问题
 * 1. 管程法
 * 2. 生产者，消费者，产品，缓冲区
 *
 * @author idbi
 */
public class ThreadCommunication01 {
    public static void main(String[] args) {
        SynContainer synContainer = new SynContainer();
        Productor productor = new Productor(synContainer);
        Consumer consumer = new Consumer(synContainer);
        productor.start();
        consumer.start();
    }

}

/**
 * 生产者
 */
class Productor extends Thread {
    SynContainer container;

    public Productor(SynContainer container) {
        this.container = container;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            container.push(new Product());
            System.out.println("生产了 " + i + "个产品");
        }
    }


}

/**
 * 消费者
 */
class Consumer extends Thread {
    SynContainer container;

    public Consumer(SynContainer container) {
        this.container = container;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            container.pop();
            System.out.println("消费了 " + i + "个产品");
        }
    }
}

/**
 * 产品
 */
class Product {
}

/**
 * 缓冲区
 */
class SynContainer {
    Product[] pool = new Product[10];
    /**
     * 容器计数
     */
    int count = 0;

    /**
     * 生产者生产
     */
    public synchronized void push(Product product) {
        if (pool.length == count) {
            // 通知消费者消费
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        pool[count] = product;
        count++;
        this.notifyAll();

    }

    /**
     * 消费者消费
     */
    public synchronized Product pop() {
        if (0 == count) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count--;
        Product product = pool[count];
        this.notifyAll();

        return product;
    }
}

