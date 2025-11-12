package JavaBasics.Level1;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个月份：");
        int month = sc.nextInt();

        switch (month){
            case 1:
            case 2:
            case 12:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("夏季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("秋季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("冬季");
                break;
            default:
                System.out.println("你输入的月份有误"); //数据测试：正确、错误、边界
        }
    }
}
