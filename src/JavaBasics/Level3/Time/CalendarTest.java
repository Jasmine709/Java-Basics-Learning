package JavaBasics.Level3.Time;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        //获取日历类对象
        Calendar c = Calendar.getInstance();

        //输入日期
        //今天
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");

        //增减日期
        //三年前的今天
        c.add(Calendar.YEAR, -3);
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");

        //10年后的5天前
        c.add(Calendar.YEAR, +10);
        c.add(Calendar.DATE, -5);
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");

        //设置当前日期的年月日
        c.set(2048, 11, 11);
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");
    }
}
