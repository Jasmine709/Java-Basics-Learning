package JavaBasics.Level2;

import java.util.Scanner;

/*需求:输入星期数，显示今天的减肥活动
        周一:跑步
        周二:游泳
        周三:慢走
        周四:动感单车
        周五:拳击
        周六:爬山
        周日:好好吃一顿*/
public class WeightLossPlan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入今天是星期几：");
        int weekday = sc.nextInt();
        plan(weekday);
    }

    public static void plan(int week) {
        switch (week){
            case 1:
                System.out.println("跑步");
            case 2:
                System.out.println("游泳");
            case 3:
                System.out.println("慢走");
            case 4:
                System.out.println("动感单车");
            case 5:
                System.out.println("拳击");
            case 6:
                System.out.println("爬山");
            case 7:
                System.out.println("好好吃一顿");
            default:
                System.out.println("你输入的星期有错误");
                break;
        }
    }
}
