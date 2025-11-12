package JavaBasics.Level4.Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        //创建HashMap集合对象
        HashMap<String, Student> hm = new HashMap<String, Student>();

        //创建学生对象
        Student s1 = new Student("张曼玉", 30);
        Student s2 = new Student("林青霞", 35);
        Student s3 = new Student("王祖贤", 33);

        //把学生添加到集合
        hm.put("it001", s1);
        hm.put("it002", s2);
        hm.put("it003", s3);

        //方式一：键找值
        //用keySet()获取所有键的集合
        Set<String> keySet = hm.keySet();
        //遍历键的集合，获取到每一个键。用增强for实现
        for (String key : keySet) {
            //根据键去找值，用get(Object key)实现
            Student value = hm.get(key);
            System.out.println(key + "," + value.getName() + "," + value.getAge());
        }
        System.out.println("--------");

        //方式二：键值对对象找键和值
        //获取所有键值对集合hm.entrySet()，ctrl alt v
        Set<Map.Entry<String, Student>> entrySet = hm.entrySet();
        //遍历键值对对象的集合，得到每一个键和值
        for (Map.Entry<String, Student> me : entrySet) {
            //根据键值对对象获取键和值
            String key = me.getKey();
            Student value = me.getValue();
            System.out.println(key + "," + value.getName() + "," + value.getAge());
        }
    }
}

