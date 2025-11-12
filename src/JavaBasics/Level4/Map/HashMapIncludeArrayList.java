package JavaBasics.Level4.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapIncludeArrayList {
    public static void main(String[] args) {
        //创建HashMap集合
        //键是String，值是ArrayList<String>
        HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

        //创建ArrayList集合，并添加元素
        ArrayList<String> sgyy = new ArrayList<String>();
        sgyy.add("诸葛亮");
        sgyy.add("赵云");
        //把ArrayList作为元素添加到HashMap集合
        hm.put("三国演义", sgyy);

        ArrayList<String> xyj = new ArrayList<String>();
        xyj.add("唐僧");
        xyj.add("孙悟空");
        //把ArrayList作为元素添加到HashMap集合
        hm.put("西游记", xyj);

        ArrayList<String> shz = new ArrayList<String>();
        shz.add("武松");
        shz.add("鲁智深");
        //把ArrayList作为元素添加到HashMap集合
        hm.put("水浒传", shz);

        //遍历HashMap集合
        Set<String> keySet = hm.keySet();
        for (String key : keySet) {
            System.out.println(key);
            ArrayList<String> value = hm.get(key);
            for (String s : value) {
                System.out.println("\t" + s);
            }
        }
    }
}
