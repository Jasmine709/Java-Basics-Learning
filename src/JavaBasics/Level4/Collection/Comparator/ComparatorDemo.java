package JavaBasics.Level4.Collection.Comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {
    public static void main(String[] args) {
        //创建集合对象 重写compare(T o1,T o2)方法
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //this.age - s.age
                //s1,s2
                int num = s1.getAge() - s2.getAge();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });

        //创建集合对象
        Student s1 = new Student("xishi",30);
        Student s2 = new Student("diaochan",35);
        Student s3 = new Student("wangzuxian",33);
        Student s4 = new Student("wangzhaojun", 40);

        Student s5 = new Student("linqingxia",40);
        Student s6 = new Student("linqingxia",40);

        //把学生添加到集合
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        //遍历集合（增强for）
        for(Student s : ts) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
