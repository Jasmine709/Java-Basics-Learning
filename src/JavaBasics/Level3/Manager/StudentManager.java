package JavaBasics.Level3.Manager;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        //创建集合对象，用于存储数据
        ArrayList<Student> array = new ArrayList<Student>();

        //用循环完成再次回到主界面
        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入您的选择：");

            //用scanner实现键盘录入
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            //用switch语句完成操作的选择
            switch (line) {
                case "1":
                    System.out.println("添加学生");
                    addStudent(array);
                    break;
                case "2":
                    System.out.println("删除学生");
                    deleteStudent(array);
                    break;
                case "3":
                    System.out.println("修改学生");
                    updateStudent(array);
                    break;
                case "4":
                    System.out.println("查看所有学生");
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用！");
                    System.exit(0);//JVM退出（java虚拟机）
            }
        }
    }

    //判断学号是否被占用
    public static boolean inUsed(ArrayList<Student> array, String sid) {
        boolean flag = false;

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    //添加学生
    public static void addStudent(ArrayList<Student> array) {  //参数为arraylist集合
        Scanner sc = new Scanner(System.in);

        //为了让sid在while循环外边被访问到，定义在循环外
        String sid;
        //为了让程序能回到这里，使用循环实现
        while (true) {
            System.out.println("请输入学生学号：");
            sid = sc.nextLine();  //这里已经定义过，不用String

            //调用判断是否重复
            boolean flag = inUsed(array, sid);
            if (flag) {
                System.out.println("你输入的学号已经使用，请重新输入");
            } else {
                break;
            }
        }

        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地：");
        String address = sc.nextLine();

        //创建学生对象
        Student s = new Student();
        //把键盘录入信息赋值给成员变量
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        //往集合种添加对象
        array.add(s);

        System.out.println("添加学生成功！");
    }


    //查看学生
    public static void findAllStudent(ArrayList<Student> array) {
        //判断集合中是否有数据
        if (array.size() == 0) {
            System.out.println("无信息，请先添加信息再查询");
            return;//为了不让程序再往下执行，return;
        }

        //显示表头信息
        // \t 其实就是tab键的位置
        System.out.println("学号\t\t\t姓名\t\t年龄\t\t居住地");

        //将集合中数据取出，按照对应格式显示学生信息，年龄显示补充”岁“
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);//从集合中取出,先从集合中取，才能用类中的getName等方法
            System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "岁\t" + s.getAddress());
        }
    }

    //删除学生
    public static void deleteStudent(ArrayList<Student> array) {
        int index = -1; //记录位置

        //键盘录入要删除的学生学号，显示提示信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生学号：");
        String sid = sc.nextLine();

        //遍历集合如有相同信息便记录索引位置
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) { //字符串要用equals
                index = i;//索引位置改变
                break;
            }
        }
        //判断信息是否存在,并删除
        if (index == -1) {
            System.out.println("该信息不存在，请重新输入");
        } else {
            array.remove(index);
            System.out.println("删除学生成功！");
        }
    }

    //修改学生
    public static void updateStudent(ArrayList<Student> array) {
        //键盘录入要删除的学生学号，显示提示信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生学号：");
        String sid = sc.nextLine();

        //键盘录入要修改的学生信息,只能一个信息一个信息的录入
        System.out.println("请输入学生新姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生新年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生新居住地：");
        String address = sc.nextLine();

        //创建学生对象
        Student s1 = new Student();
        s1.setSid(sid);//用set录入新对象的信息
        s1.setName(name);
        s1.setAge(age);
        s1.setAddress(address);

        int index = -1; //记录位置
        //遍历集合修改对应的学生信息
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
                break;
            }
//            else {
//                System.out.println("未查询到对象");
//            }//这种方法会输出很多else
        }
        if (index == -1) {
            System.out.println("该信息不存在，请重新输入");
        } else {
            array.set(index, s1);//set方法
            System.out.println("修改学生成功！");
        }
    }
}
