package com.idbi.thread;


/**
 * 静态代理
 * 1. 真实对象和代理对象都要实现同一个接口
 * 2. 代理对象要代理真实角色
 * 3. 代理对象可以做很多真实对象做不了的事情
 *    真实对象专注做自己的事情
 */
public class StaticProxy {
    public static void main(String[] args) {
        Person you = new Person();
        WeddingCompany we = new WeddingCompany(you);
        we.marry();
    }


}


interface Marry {
    void marry();
}

// 真实角色
class Person implements Marry{
    public void marry() {
        System.out.println("person marry");
    }
}

// 代理角色
class WeddingCompany implements Marry{
    private Marry target;

    public WeddingCompany(Marry target){
        this.target = target;
    }

    public void marry() {
        before();
        target.marry();
        after();
    }

    private void before(){
        System.out.println("办理前收定金");
    }
    private void after(){
        System.out.println("办理后收尾款");
    }

}


