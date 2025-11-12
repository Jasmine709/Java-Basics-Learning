package JavaBasics.Level3.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        //创建集合对象
        java.util.ArrayList<Student> array = new java.util.ArrayList<Student>();
        //创建学生对象
        Student s1 = new Student("林青霞",30);
        Student s2 = new Student("风清扬",33);
        Student s3 = new Student("张曼玉",18);
        //添加学生对象到集合中
        array.add(s1);
        array.add(s2);
        array.add(s3);
        //遍历
        for (int i = 0; i < array.size() ; i++) {  //区别array.length(数组)，此为集合
            Student s = array.get(i);//集合获取元素
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
