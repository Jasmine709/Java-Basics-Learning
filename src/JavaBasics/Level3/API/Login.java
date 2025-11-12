package JavaBasics.Level3.API;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String username = "waxy";
        String password = "mima";

        Scanner sc = new Scanner(System.in); //输入

        for (int i = 0; i < 3; i++) {  //循环
            System.out.println("请输入用户名：");
            String name = sc.nextLine();

            System.out.println("请输入密码：");
            String pwd = sc.nextLine();

            if (name.equals(username) && pwd.equals(password)) { //字符串对比为equals()，字符串用==比较的是地址的值
                System.out.println("登录成功");
                break;
            } else if (2 - i == 0) {
                System.out.println("你的账户被锁定，请与管理员联系");
            } else {
                System.out.println("登陆失败，你还有" + (2 - i)+ "次机会");  //用i来倒数
            }
        }

    }
}
