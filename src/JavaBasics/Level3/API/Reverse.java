package JavaBasics.Level3.API;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        String s = reverse(line);
        System.out.println(s);
    }
    public static String reverse(String l){
        String l1 = "";

        for (int i = l.length()-1; i >= 0; i--) {  //注意反向的for怎么写
            l1 += l.charAt(i);  //注意不是l[i]
        }

        return l1;
    }
}
