package JavaBasics.Level3.Class.Standard;

/*
    学生类
*/
public class Student {
    //成员变量
    private String name;
    private int age;

    //构造方法
    public Student() {  //无参构造

    }

    public Student(String name, int age) {  //带多个参数的构造方法
        this.name = name;
        this.age = age;
    }

    //成员方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }

}
