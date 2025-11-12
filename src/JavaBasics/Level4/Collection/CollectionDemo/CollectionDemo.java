package JavaBasics.Level4.Collection.CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        //创建Collection集合对象
        Collection<Student> c = new ArrayList<Student>();

        //创建学生对象
        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("张曼玉", 35);
        Student s3 = new Student("王祖贤", 33);

        //将学生添加到集合
        c.add(s1);
        c.add(s2);
        c.add(s3);

        //遍历（迭代器）
        Iterator<Student> it = c.iterator();
        while (it.hasNext()) {  //判断
            Student s = it.next();  //获取
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
