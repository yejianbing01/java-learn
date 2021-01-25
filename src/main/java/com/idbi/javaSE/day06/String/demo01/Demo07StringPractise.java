package cn.study.day06.String.demo01;

/*
题目：
定义一个方法，把数组{1,2,3}按照指定格式拼接成一个字符串。格式参照如下：[word1#word2#word3]。
 */
public class Demo07StringPractise {

    public static void main(String[] args) {
        int[] array = {1,2,3};
        String result = fromArrayToString(array);
        System.out.println(result);


    }

    public static String fromArrayToString(int[] array){
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if(i == array.length -1){
                str += "word" + i + "]";
            }else{
                str += "word" + i + "#" ;
            }
        }
        return str;
    }

}
