package Acwing;

import java.util.Scanner;

public class ErFenZhengShu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            q[i] = sc.nextInt();
        }
        // 询问个数
        while(m-- > 0) {
            int x = sc.nextInt();

            int l = 0;
            int r = n - 1;
            while (l < r) {
                int mid = l + r >> 1;//要不要加一后面再说
                if (q[mid] >= x) { //在右半边mid = l+r/2
                    r = mid;
                } else {
                    l = mid + 1;
                }
            }
            //循环结束后r = l
            if (q[l] != x) { //此时l就是第一个x的位置了（左边界）
                System.out.println("-1 -1");
            } else {
                System.out.printf("%d ",l);

                l = 0;
                r = n - 1;
                while (l < r) {
                    int mid = l + r + 1 >> 1;
                    if (q[mid] <= x) l = mid; //再看右边界
                    else r = mid - 1;
                }
                System.out.printf("%d", l);
            }
        }
    }
}