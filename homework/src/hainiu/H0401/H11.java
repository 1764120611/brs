package hainiu.H0401;

import java.util.Arrays;

public class H11 {
    public static void main(String[] args) {
        String str="11 110 20 25 18 17 15 22";
        String[] strArr=str.split(" ");
        int[]intArr=new int[strArr.length];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i]=Integer.parseInt(strArr[i]);
        }
        Arrays.sort(intArr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < intArr.length; i++) {
            sb.append(intArr[i]);
            if (i<intArr.length-1);
            sb.append(" ");
        }
        String result =sb.toString();
        System.out.println(result);
    }
}
