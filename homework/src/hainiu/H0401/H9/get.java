package hainiu.H0401.H9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class get {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("1[3-9]\\d{9}");
        String str ="杜松子的电话是:13644859823,扇宝的电话是:19355863257";
        Matcher matcher=pattern.matcher(str);
        while (matcher.find()){
            String s=matcher.group();
            System.out.println(s);
        }
    }
}
