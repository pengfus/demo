package com.bryce.demo.date;

import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormateDemo {

    @Test
    public void TestYY(){

        DateFormat format = new SimpleDateFormat("YYMMddHHmm");
//        DateFormat format = new SimpleDateFormat("yyMMddHHmm");
        Date d = new Date(2019,11,28,11,11,11);
        String format1 = format.format(d);
        System.out.println(format1);


    }
}
