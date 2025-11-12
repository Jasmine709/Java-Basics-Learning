package Acwing;

import java.util.Scanner;

public class qianZhuiHe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n+1];//记得定义n+1,注意越界
        int[] s = new int[n+1];

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 1; i <= n ; i++) {
            s[i] = s[i-1] + a[i];//i-1
        }

        while (m-- != 0){  //输入m行，接收要在循环内
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = s[r] - s[l-1];
            System.out.println(ans);
        }
    }
}