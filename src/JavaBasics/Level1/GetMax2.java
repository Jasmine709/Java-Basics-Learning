package JavaBasics.Level1;

public class GetMax2 {
    public static void main(String[] args) {
        getMax(10,20);//使用常量

        int a = 20;
        int b = 10;
        getMax(a, b);//使用变量
    }

    public static void getMax(int a, int b) { //注意没有return值，定义为void
        if(a > b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
