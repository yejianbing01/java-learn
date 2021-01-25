package cn.study.day06.String.demo01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateMethod {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date date = new Date();

        System.out.println(calendar.getTime());


    }


}
