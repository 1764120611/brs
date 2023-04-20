package hainiu.H0401.H9;

public class replace {
    public static void main(String[] args) {
        String str="杜松子的QQ号是：1985647855";
        String regex="1[3-9]\\d{3,10}";
        String repstr = str.replaceAll(regex, "*****");
        System.out.println(repstr);

    }
}
