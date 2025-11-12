package JavaBasics.Level3.API;

public class ArrayToString1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String s = arrayToString(arr);
        System.out.println(s);
    }

    public static String arrayToString(int[] arr) {
        //StringBuilder
        StringBuilder sb = new StringBuilder();

        sb.append("["); //append方法拼接

        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]);
                sb.append(", ");
            }
        }
        sb.append("]");

        String s = sb.toString();//转化为string类型

        return s;
    }
}
