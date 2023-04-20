package hainiu.H0403;

import java.util.LinkedList;

//LinkedList 108号卡牌拿一张扔掉再拿一张放最后。如此反复最后剩的牌是。
public class H2 {
    public static void main(String[] args) {
        //储存108张卡牌
        LinkedList<Object> list = new LinkedList<>();
        for (int i = 1; i <= 108; i++) {
            list.add(i);
        }
        //删第一个元素，再将第一个移到最后如此循环到长度为1
        while (list.size()>1){
            list.removeFirst();
            list.addLast(list.removeFirst());
        }
        //吃鸡的那个
        Object num = list.get(0);
        System.out.println(num);
    }
}
