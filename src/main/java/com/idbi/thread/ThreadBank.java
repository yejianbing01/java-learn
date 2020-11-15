package com.idbi.thread;

/**
 * 模拟多线程取钱
 * synchronized 锁方法
 * synchronized(obj){} 锁对象
 * - obj称为同步监视器，可以是任何对象，推荐将共享的对象作为同步监视器
 */
public class ThreadBank extends Thread {
    final Account account;
    int drawingMoney;
    int nowMoney;

    public ThreadBank (Account account,int drawingMoney, String name) {
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;
    }

    @Override
    public void run(){
        //
        synchronized (account){
            if(account.money - drawingMoney < 0){
                System.out.println(this.getName() + "钱不够了");
                return;
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            account.money -= drawingMoney;
            nowMoney += drawingMoney;

            System.out.println(this.getName() + "取了钱：" + nowMoney);
            System.out.println(account.name + "卡内余额为：" + account.money);

        }

    }


    public static void main(String[] args) {
        Account account = new Account(1000, "银行账户");

        ThreadBank user1 = new ThreadBank(account, 500, "用户1");
        ThreadBank user2 = new ThreadBank(account, 1000, "用户2");

        user1.start();
        user2.start();

    }

}


class Account {
    int money;
    String name;

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}