package Acwing;

import java.util.Scanner;

public class ErFenFuDian {
    public static void main(String[] args) {
        // 求根号x
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double l = 0;
        double r = x; //根号一定在0-x区间内
        while (r - 1 > 1e-4) { //10的-6次方可以近似看作答案了  比要求的有效位数多2
            double mid = (l + r) / 2; //不能用>>1
            if (mid * mid >= x) r = mid;
            else l = mid;
        }
        System.out.printf("%f",l);
    }
}
