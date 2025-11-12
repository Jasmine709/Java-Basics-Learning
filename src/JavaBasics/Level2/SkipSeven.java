package JavaBasics.Level2;

/*需求:朋友聚会的时候可能会玩一个游戏:逢七过。
规则是:从任意一个数字开始报数，当你要报的数字包含7或者是7的倍数时都要说:过。
为了帮助大家更好的玩这个游戏，这里我们直接在控制台打印出1-100之间的满足逢七必过规则的数据。
这样，大家将来在玩游戏的时候,就知道哪些数据要说:过。*/

public class SkipSeven {
    public static void main(String[] args) {
        skipSeven();
    }

    public static void skipSeven() {
        //要么个位是7，要么十位是7，要么能被7整除
        for (int i = 1; i < 101; i++) {
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) { //注意==和=
                System.out.print(i);
                System.out.print(" ");
            }
        }//直接输出全部数组:Arrays.toString(arr)
    }
}
