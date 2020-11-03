package com.idbi.javaSE;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args) {
        Date date = new Date();
        // date.getTime();
        System.out.println(date);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String d = sdf.format(date);
        System.out.println(d);

        Calendar calender = Calendar.getInstance();
         calender.add(Calendar.MONTH, 1);
        System.out.println(sdf.format(calender.getTime()));
    }


}
