package JavaBasics.Level2;

import java.util.Scanner;

//已知一个数组arr :{19, 28, 37, 46, 50}; 键盘录入一个数据，查找该数据在数组中的索引，并在控制台输出找到的索引值
public class ArrayIndex {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(index(arr,x));
    }

    public static int index(int[] arr, int x) {
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                a = i;
            }
        }
        return a;
    }
}
