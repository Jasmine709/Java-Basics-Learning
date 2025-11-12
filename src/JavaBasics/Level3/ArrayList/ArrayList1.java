package JavaBasics.Level3.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList<Student1> array = new ArrayList<Student1>();

        addStudent(array);
        addStudent(array);
        addStudent(array);

        for (int i = 0; i < array.size(); i++) {
            Student1 s = array.get(i);//集合获取元素
            System.out.println(s.getName() + "," + s.getAge());
        }

    }

    //为了提高代码的复用性。用方法来改进程序
    public static void addStudent(ArrayList<Student1> array) {
        //从键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();

        //创建学生类赋值成员变量
        Student1 s = new Student1();
        s.setName(name);
        s.setAge(age);

        //往集合种添加对象
        array.add(s);
    }
}
