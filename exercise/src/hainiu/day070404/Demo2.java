package hainiu.day070404;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("hello");
        a.add("world");
        a.add("java");
        a.add("javase");
        Iterator<String> it = a.iterator();
        while (it.hasNext()){
            String s=it.next();
            if ("java".equals(s)){
                it.remove();
            }
        }
        System.out.println(a);

    }

}
