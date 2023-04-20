package hainiu.H0403.H5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("张楚岚","陆玲珑");
        map.put("张灵玉","夏荷");
        map.put("凌小东","陆依依");
        map.put("贾正亮","风沙燕");
        map.put("诸葛青","傅容");
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            String value = map.get(key);
            System.out.println(key+"和"+value);
        }
        System.out.println("-------------");
        map.forEach((k,v)->System.out.println(k+"~"+v));
        System.out.println("-------------");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"-"+value);
        }
    }
}
