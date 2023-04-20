package hainiu.H0404;

import java.io.*;
public class H3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\觋时雨\\Desktop\\test\\a.txt"));
        char[]chs=new char[8192];
        int len;
        while ((len=br.read(chs))!=-1){
            System.out.println(new String(chs,0,len));
        }
        br.close();
       /* BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\\\Users\\\\觋时雨\\\\Desktop\\\\test\\\\b.txt"));
        bw.write("hwllo\r\n");
        bw.write("world\r\n");
        bw.close();*/

    }
}
