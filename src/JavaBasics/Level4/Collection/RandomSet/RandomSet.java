package JavaBasics.Level4.Collection.RandomSet;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomSet {
    public static void main(String[] args) {
        //随机数：random
        //存储10个：集合
        //不重复：set

        //创建Set集合对象
        Set<Integer> set = new HashSet<Integer>();//不能排序
        //Set<Integer> set = new TreeSet<Integer>();//可以排序
        //没导包可以按alt enter导包

        //创建随机数对象
        Random r = new Random();

        //判断集合长度是不是小于10
        while (set.size() < 10) {
            //产生一个随机数，添加到集合
            int number = r.nextInt(20) + 1;
            set.add(number);
        }

        //遍历结合
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
