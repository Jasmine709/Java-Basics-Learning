package JavaBasics.Level4.Collection.Comparable;

import java.util.TreeSet;

public class ComparableDemo {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Student> ts = new TreeSet<Student>();

        //创建集合对象
        Student s1 = new Student("xishi",30);
        Student s2 = new Student("diaochan",35);
        Student s3 = new Student("wangzuxian",33);
        Student s4 = new Student("wangzhaojun", 40);

        Student s5 = new Student("linqingxia",40);

        //把学生添加到集合
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        //遍历集合（增强for）
        for(Student s : ts) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
