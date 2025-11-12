package JavaBasics.Level3.Time;

import java.util.Calendar;
import java.util.Scanner;

public class February {
    public static void main(String[] args) {
        //键盘输入年份
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt(); //year应该是int，输入也为nextint

        //设置日历对象的年月日
        Calendar c = Calendar.getInstance();
        c.set(year,2,1); //月份是从0开始数的

        //三月一日往前推一天就是二月最后一天
        c.add(Calendar.DATE,-1);

        //输出
        int date = c.get(Calendar.DATE);

        System.out.println(year+"年的二月有"+date+"天");
    }
}
