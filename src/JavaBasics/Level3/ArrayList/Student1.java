package JavaBasics.Level3.ArrayList;

public class Student1 {
    //为了键盘录入方便，把学生类的成员变量都定义为String类型
    private String name;
    private String age;

    public Student1(){}//构造函数没有返回值void、int等类型
    public Student1(String name,String age){
        this.name = name;
        this.age = age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
