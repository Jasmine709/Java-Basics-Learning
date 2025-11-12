package JavaBasics.Level4.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class CollectionsDemo {
    public static void main(String[] args) {
        //创建List集合对象
        ArrayList<Student> array = new ArrayList<Student>();

        //创建学生对象
        Student s1 = new Student("linqingxia", 30);
        Student s2 = new Student("zhangmanyu", 35);
        Student s3 = new Student("wangzuxian", 33);
        Student s4 = new Student("liuyuan", 33);

        //将学生添加到集合
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);

        //使用Collection对ArrayList集合排序
        //sort(list<T>list,Comparator<? super T>c)
        Collections.sort(array, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //按年龄从小到大，相同时按姓名字母顺序
                int num = s1.getAge() - s2.getAge();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });

        //遍历集合
        for (Student s : array) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}