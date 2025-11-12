package JavaBasics.Level1;

public class GetMax1 {
    public static void main(String[] args) {
        getMax();  //注意不能在main方法里定义方法
    }
    public static void getMax(){ //无参函数别忘记加括号，返回值为void
        int a = 10;
        int b = 20;
        if(a > b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
