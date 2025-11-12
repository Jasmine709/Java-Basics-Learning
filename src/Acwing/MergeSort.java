package Acwing;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int N = 1000010;
        int[] q = new int[N];
        for (int i = 0; i < n; i++) {
            q[i] = sc.nextInt();
        }

        marge_sort(q, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", q[i]);
        }

    }

    public static void marge_sort(int[] q, int l, int r) {
        if (l >= r) return;

        int mid = l + r >> 1;
        int[] tmp = new int[1000010];
        marge_sort(q, 0, mid);
        marge_sort(q, mid + 1, r);

        int i = l;
        int j = mid + 1; // mid + 1
        int k = 0;// k和tmp用来存储已经排好序的数组
        while (i <= mid && j <= r) {
            if (q[i] <= q[j]) tmp[k++] = q[i++];
            else tmp[k++] = q[j++];
        }
        //比完后剩下的
        while (i <= mid) {
            tmp[k++] = q[i++];
        }
        while (j <= r) {
            tmp[k++] = q[j++];
        }
        //放回q数组中,i必须是l而不能是0，i小于等于r
        for (i = l, j = 0; i <= r; i++, j++) {
            q[i] = tmp[j];
        }
    }
}