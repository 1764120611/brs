package hainiu.H0403;

import java.util.ArrayList;
import java.util.Iterator;
//ArrayList集合，随意储存几个字符并用三种方式便利
public class H1 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("天青色等烟雨");
        list.add("而我在等你");
        list.add("月色被打捞起");
        list.add("晕开了结局");
        list.add("如传世的青花瓷");
        list.add("自顾自美丽");
        //迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s=it.next();
            System.out.print(s+"\t");
        }System.out.println(" ");
        System.out.println("---------------");
        //for
        for (String s : list) {
            System.out.print(s+"\t");
        }System.out.println(" ");
        System.out.println("---------------");
        //fori索引
        for (int i = 0; i <list.size(); i++) {
            String s=list.get(i);
            System.out.print(s+"\t");
        }



    }
}
