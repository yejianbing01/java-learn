package cn.study.day04ScannerRandom.demo02;

/*
创建对象的标准格式：
类名称 对象名 = new 类名称();

匿名对象就是只有右边的对象，没有左边的名字和赋值运算符
new 类名称();

注意事项：匿名对象只能使用一次
 */
public class Demo01Anonymous {

    public static void main(String[] args) {
        Person one = new Person();
        one.name = "迪丽热巴";
        one.showName();

        // 匿名对象
        new Person();
    }

}
