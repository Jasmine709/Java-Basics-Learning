package JavaBasics.Level1;

public class ArrayMax1 {
    public static void main(String[] args) {
        int[] arr = {12, 45, 98, 73, 60};
        System.out.println(getMax(arr));
    }
    //两个明确：返回值类型：int，参数：int[] arr
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
