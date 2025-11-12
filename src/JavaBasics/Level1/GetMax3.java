package JavaBasics.Level1;

public class GetMax3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //方法一：使用变量保存
        int max = getMax(a, b);
        System.out.println(max);
        //方法二：直接打印
        System.out.println(getMax(a, b));
    }

    public static int getMax(int a, int b) {
        if(a > b){
            return a;
        }else{
            return b;
        }
    }
}
