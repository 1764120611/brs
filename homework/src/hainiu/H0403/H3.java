package hainiu.H0403;

import java.util.HashSet;
import java.util.Iterator;

//HashSet储存几个学生对象，要求对象如果所以属性都相同就认为是重复，便利结果。
public class H3 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("一杆铁画银钩");
        set.add("落处却温柔");
        set.add("说动笔的人");
        set.add("动情总难收");
        set.add("落处却温柔");
        System.out.println(set);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.print(s+"\t");
        }System.out.println();
        for (String s : set) {
            System.out.print(s+"\t");
        }


    }
}
