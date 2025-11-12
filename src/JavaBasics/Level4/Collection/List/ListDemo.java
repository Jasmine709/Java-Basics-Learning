package JavaBasics.Level4.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //创建List集合对象
        List<Student> list = new ArrayList<Student>();

        //创建学生对象
        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("张曼玉", 35);
        Student s3 = new Student("王祖贤", 33);

        //将学生添加到集合
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //法一：迭代器遍历（集合特有遍历方式）
        Iterator<Student> it = list.iterator();
        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName() + "," + s.getAge());
        }

        System.out.println("--------");

        //法二：for循环遍历（带有索引遍历方式）
        for (int i = 0; i < list.size(); i++) {  //集合长度
            Student s = list.get(i); //带索引的get方法
            System.out.println(s.getName() + "," + s.getAge());
        }

        System.out.println("--------");

        //法三：增强for（最方便的遍历方式）
        for (Student s:list) {  //内部原理是一个iterator迭代器
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
