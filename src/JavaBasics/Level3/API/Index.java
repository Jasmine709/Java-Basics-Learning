package JavaBasics.Level3.API;

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：" );
        String line = sc.nextLine();

        for (int i = 0; i < line.length(); i++) {  //获取字符串长度 length(); array获取长度为length;
            System.out.print(line.charAt(i)); //charAt(int index); 返回指定索引处的char值，字符串的索引也是从0开始的
        }
    }
}
