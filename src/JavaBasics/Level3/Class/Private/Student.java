package JavaBasics.Level3.Class.Private;

/*
    学生类
 */
public class Student {
    //成员变量
    private String name;//默认为public（string name;）
    private int age;

    //get/set方法
    public void setName(String n) {  //设置成员变量的值 void,String n
        name = n;
    }

    public String getName() {  //获取成员变量的值 String，无参
        return name;
    }

    public void setAge(int a) {
        if (a < 0 || a > 120) {      //可以在set方法中设置获取范围
            System.out.println("你给的年龄有误");
        } else {
            age = a;
        }
    }

    public int getAge() {
        return age;
    }

    public void show() {//不用传参！！！
        System.out.println(name + "," + age);
    }

}

