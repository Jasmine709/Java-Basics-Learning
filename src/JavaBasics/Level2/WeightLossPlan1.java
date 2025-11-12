package JavaBasics.Level2;

/*需求:输入星期数，显示今天的减肥活动
        周一:跑步
        周二:游泳
        周三:慢走
        周四:动感单车
        周五:拳击
        周六:爬山
        周日:好好吃一顿*/

import java.util.Scanner;

public class WeightLossPlan1 {
    public static void main(String[] args) { //别忘了main函数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入今天是星期几：");
        int weekday = sc.nextInt();
        plan(weekday);
        }
    public static void plan(int weekday){
        if(weekday == 1){  //注意赋值=和判断==的区别
            System.out.println("跑步");
        }else if(weekday == 2){
            System.out.println("游泳");
        }else if(weekday == 3){
            System.out.println("慢走");
        }else if(weekday == 4){
            System.out.println("动感单车");
        }else if(weekday == 5){
            System.out.println("拳击");
        }else if(weekday == 6){
            System.out.println("爬山");
        }else if(weekday == 6){
            System.out.println("好好吃一顿");
        } else{
            System.out.println("你输入的星期有错误");
        }
    }
}