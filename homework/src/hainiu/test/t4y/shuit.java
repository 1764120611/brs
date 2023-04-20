package hainiu.test.t4y;

import java.util.LinkedList;

public class shuit {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("及时雨宋江");
        list.add("玉麒麟卢俊义");
        list.add("智多星吴用");
        list.add("入云龙公孙胜");
        list.add("大刀关胜");
        list.add("豹子头林冲");
        list.add("霹雳火秦明");
        list.add("双鞭呼延灼");
        list.add("小李广花荣");
        list.add("小旋风柴进");
        list.add("扑天雕李应");
        list.add("美髯公朱仝");
        list.add("花和尚鲁智深");
        list.add("行者武松");

        //创建3条线程
        Thread t1 = new Thread(new shui(list),"线程A");
        Thread t2 = new Thread(new shui(list),"线程B");
        Thread t3 = new Thread(new shui(list),"线程C");

        //开启线程
        t1.start();
        t2.start();
        t3.start();
    }
}
