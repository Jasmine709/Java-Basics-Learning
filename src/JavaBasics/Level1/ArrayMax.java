package JavaBasics.Level1;

public class ArrayMax {
    public static void main(String[] args) {
        int[] arr = {12, 45, 98, 73, 60};
        //取第一个数据为变量初始值
        int max = arr[0];

        for(int x=1; x<arr.length; x++){
            if(arr[x] > max){
                max = arr[x];
            }
        }
        System.out.println("max:" + max);
    }
}
