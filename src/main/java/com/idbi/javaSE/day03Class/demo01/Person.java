package cn.study.day03Class.demo01;

/*
 * 问题描述: 定义Person的年龄时，无法阻止不合理的数值被设置进来
 * 解决方案：用private关键字将需要保护的成员变量进行修饰
 *
 * 一旦使用了private进行修饰，那么本类中任然可以随意访问
 * 但是一旦超出本类范围之外就不能再直接访问了
 *
 * 间接访问private成员变量，需要定义一对getter/setter方法
 * 必须叫 setXxx getXx
 */
public class Person {
    String name;
    private int age = 1;

    public void show(){
        System.out.println("我叫：" + name + ", 年龄：" + age);
    }

    /**
     * 用于设置age
     * @param num 年龄
     */
    public void setAge(int num){
        if(num<100 && num >0){
            age = num;
        } else {
            throw new Error("数据不合理");
        }
    }

    /**
     * 用于获取age
     * @return age˙
     */
    public int getAge(){
        return age;
    }
}
