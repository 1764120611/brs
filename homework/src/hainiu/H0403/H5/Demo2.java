package hainiu.H0403.H5;

import java.util.HashMap;

public class Demo2 {
    public static void main(String[] args) {
        String str = "assert listagg  prior  foreign cascade commit listagg assert prior foreign foreign listagg   prior  foreign";
        String[] arr = str.split("\\s+");
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            map.put(s, map.containsKey(s) ? map.get(s)+1 : 1);
        }map.forEach((k,v)-> System.out.println("单词"+k+"有"+v+"个"));
    }
}
