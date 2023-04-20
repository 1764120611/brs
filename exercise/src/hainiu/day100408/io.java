package hainiu.day100408;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class io {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s ="诸葛孔明";
        byte[]bys=s.getBytes("GBK");
        System.out.println(Arrays.toString(bys));
        String ss=new String(bys,"GBK");
        System.out.println(ss);
    }
}
