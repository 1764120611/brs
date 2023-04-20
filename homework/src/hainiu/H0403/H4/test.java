package hainiu.H0403.H4;

import java.util.TreeMap;
import java.util.TreeSet;

public class test {
    public static void main(String[] args) {
        TreeSet<Object> set = new TreeSet<>();
        Worker w1=new Worker("陆依依",22,10000);
        Worker w2=new Worker("杜松子",25,9000);
        Worker w3=new Worker("扇宝",24,9000);
        Worker w4=new Worker("凌露",23,8500);
        Worker w5=new Worker("陆玲珑",20,7000);
        set.add(w1);
        set.add(w2);
        set.add(w3);
        set.add(w4);
        set.add(w5);
        for (Object worker : set) {
            System.out.println(worker);
        }

    }
}
