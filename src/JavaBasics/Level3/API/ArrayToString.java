package JavaBasics.Level3.API;

public class ArrayToString {
    public static void main(String[] args) {
        //定义一个数组，静态初始化
        int[] arr = {1, 2, 3};
        //调用方法，用一个变量接收结果
        String s = arrayToString(arr);
        System.out.println(s);
    }

    public static String arrayToString(int[] arr) {
        //初始化一个字符串
        String s = "";
        s += "[";
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                s += arr[i];;
            }else{
                s += arr[i];
                s += ", ";
            }
        }
        s += "]";

        return s;
    }
}
