package Acwing;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int N = 1000000010;
        int []q = new int[N];
        for (int i = 0; i < n; i++) {
            q[i] = sc.nextInt();
        }

        quick_sort(q, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.printf("%d ",q[i]);
        }
    }

    public static void quick_sort(int []q, int l, int r){
        if (l >= r)return;

        int x = q[l], i = l - 1, j = r+1; // 设定x,和指针ij
        while (i<j){
            do i++; while(q[i] < x);
            do j--; while(q[j] > x);
            if(i < j){
                int t = q[i];
                q[i] = q[j];
                q[j] = t;
            }
        }

        quick_sort(q, 0 , j);
        quick_sort(q, j+1, r);
    }
}