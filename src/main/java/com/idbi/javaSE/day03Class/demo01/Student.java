package cn.study.day03Class.demo01;

/*
*对于基本类型当中的 boolean值，Getter方法，必须使用isXxx方法名称
*
*/
public class Student {
    private String name;
    private int age;
    private boolean male; // 是否是男性

    public void setMale(boolean b){
        male = b;
    }

    public boolean isMale(){
        return male;
    }

    public void setName(String str){
        name = str;
    }

    public String getName(){
        return name;
    }

    public void setAge(int num){
        age = num;
    }

    public int getAge(){
        return age;
    }

}
