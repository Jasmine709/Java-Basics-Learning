package JavaBasics.Level3.API;

import java.util.Scanner;

public class Reverse1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        String s = myreverse(line);
        System.out.println(s);
    }
    public static String myreverse(String s){
        //法一
//        StringBuilder sb = new StringBuilder(s);//由string转为StringBuilder
//        sb.reverse();
//        String ss = sb.toString();//转化为String
//        return ss;

        //法二
        return new StringBuilder(s).reverse().toString();

    }
}
