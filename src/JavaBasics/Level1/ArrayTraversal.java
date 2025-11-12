package JavaBasics.Level1;

public class ArrayTraversal {
    public static void main(String[] args) {
        //数组元素静态初始化
        int[] a = {11, 22, 33, 44, 55};  //注意为大括号

        printArray(a);

    }

    public static void printArray(int[] a) {
        System.out.print("["); //print不换行，println换行
        for (int i = 0; i < a.length; i++) { //a.length表示数组长度
            if (i == a.length-1) {
                System.out.print(a[i]);
            }else{
                System.out.print(a[i] + ",");
            }
        }
        System.out.print("]");//字符常量：单括号括起来的一个字符，字符串常量：双引号括起来的多个字符（0，1，多个）
    }

}
