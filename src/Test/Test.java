package Test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] v = new int[n];
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (j < w[i - 1]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i - 1]] + v[i - 1]);
                }
            }
        }
        System.out.println("装入背包中物品总价值最大为：" + dp[n][m]);
        System.out.print("装入的物品的序号为：");
        int j = m;
        for (int i = n; i > 0; i--) {
            if (dp[i][j] > dp[i - 1][j]) {
                System.out.print(i + " ");
                j -= w[i - 1];
            }
        }
    }
}