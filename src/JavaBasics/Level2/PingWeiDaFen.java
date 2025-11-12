package JavaBasics.Level2;

import java.util.Scanner;

//在编程竞赛中,有6个评委为参赛的选手打分,分数为0-100的整数分。
//选手的最后得分为:去掉一个最高分和一个最低分后的4个评委平均值(不考虑小数部分)。
public class PingWeiDaFen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入六个评委的打分：");
        int[] arr = new int[6];
        //用循环输入数组
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(daFen(arr));
    }
    public static int daFen(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != min && arr[i] != max){
                sum += arr[i];
            }
        }
        int avg = sum / 4;
        return avg;
    }
}
