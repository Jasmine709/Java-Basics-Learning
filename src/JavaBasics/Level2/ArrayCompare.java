package JavaBasics.Level2;
//设计一个方法，用于比较两个数组的内容是否相同
public class ArrayCompare {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        int[] arr1 = {11, 22, 33, 44, 5};
        System.out.println(compare(arr,arr1));
    }

    public static boolean compare(int[] arr, int[] arr1) {
        //先比较长度，再比较内容
        if(arr.length != arr1.length){
            return false;
        }else{
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] != arr1[i]){
                    return false;  //如果不同返回flase，相同则继续循环，直到跳出循环返回true
                }
            }
            return true;
        }

    }
}
