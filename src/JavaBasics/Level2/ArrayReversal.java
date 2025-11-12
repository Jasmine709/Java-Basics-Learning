package JavaBasics.Level2;
//已知一个数组arr = {19,28, 37, 46, 50};用程序实现把数组中的元素值交换，
//交换后的数组arr = {50, 46, 37, 28, 19}; 并在控制台输出交换后的数组元素。
public class ArrayReversal {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        reversal(arr);
    }

    public static void reversal(int[] a) {
        System.out.print("arr = {");
        for (int i = a.length-1; i > -1 ; i--) {
            if(i == 0) {
                System.out.print(a[i]);
                System.out.print("}");
            }else {
                System.out.print(a[i]);
                System.out.print(", ");
            }
        }
    }
}