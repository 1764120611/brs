package hainiu.H0401;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//完成Date对象和字符串的互换
public class H8 {
    public static void main(String[] args) throws ParseException {
        Date date=new Date();
        System.out.println(date);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
        String s=sdf.format(date);
        System.out.println(s);
        String str ="2000-01-13 12:23:45";
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date2=sdf2.parse(str);
        System.out.println(date2);
    }
}
