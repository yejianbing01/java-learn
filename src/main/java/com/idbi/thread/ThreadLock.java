package com.idbi.thread;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author yejianbing
 * ReentrantLock 可重入锁
 */
public class ThreadLock {

     public static void main(String[] args) {
          Phone phone = new Phone();

          new Thread(phone, "t1").start();
          new Thread(phone, "t2").start();
     }

}

class Phone implements Runnable {
     ReentrantLock lock =  new ReentrantLock();

     public void sendEmail() {
          lock.lock();
          try{
               System.out.println(Thread.currentThread().getName() + "------发送邮件");
          }catch (Exception e){
               e.printStackTrace();
          }finally {
               lock.unlock();
          }
     }

     public void sendMsg() {
          lock.lock();
          try {
               System.out.println(Thread.currentThread().getName() + "---------发送信息");
               sendEmail();
          }catch (Exception e){
               e.printStackTrace();
          }finally{
               lock.unlock();
          }
     }

     @Override
     public void run() {
          sendMsg();
     }

}
