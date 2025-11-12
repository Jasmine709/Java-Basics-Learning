package JavaBasics.Level4.Collection.ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");

        ListIterator<String> lit = list.listIterator();
        while(lit.hasNext()){  //lit.hasPrevious()判断前一个
            String s = lit.next(); //lit.previous()获取前一个
            if(s.equals("world")){
                lit.add("javaee");  //listIterator独有特性，在迭代期间更改
            }
        }

        System.out.println(list);
    }
}
