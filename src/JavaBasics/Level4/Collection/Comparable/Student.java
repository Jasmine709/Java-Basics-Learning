package JavaBasics.Level4.Collection.Comparable;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {

    }

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //重写自然排序函数
    @Override
    public int compareTo(Student s) {
        //必须按照排序的主要条件和次要条件来写（年龄、姓名）

        //return 0;  //只输出第一行
        //return 1;  //按照存储顺序正序输出
        //return -1; //按照存储顺序倒序输出
        //int num = s.age - this.age;//按照年龄降序输出
        int num = s.age - this.age;//按照年龄正序输出

        //年龄相同时，按照姓名的字母顺序排序
        int num2 = num == 0 ? this.name.compareTo(s.name) : num;

        return num2;
    }
}
