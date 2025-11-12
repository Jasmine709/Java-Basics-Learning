package JavaBasics.Level3.API;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入字符串：");
        String line = sc.nextLine();

        //定义三个统计变量，初始值都为0
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                bigCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            } else if (ch >= '0' && ch <= '9') {
                numberCount++;
            }
        }

        System.out.println("大写字母：" + bigCount + "个");
        System.out.println("小写字母：" + smallCount + "个");
        System.out.println("数字" + numberCount + "个");
    }
}
