package hainiu.H0401.H9;

public class capture {
    public static void main(String[] args) {
        String s="是是..是离..愁愁...愁愁别..是..........一.一一.滋滋滋.滋滋味.....味..味味味..在在在心头头头";
        String s1=s.replaceAll("\\.","");
        String s2=s1.replaceAll("(.)\\1+","$1");
        System.out.println(s2);
    }
}
