package hainiu.H0404;

import java.io.*;

public class exercise {
    public static void main(String[] args) throws IOException {
        //FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\觋时雨\\Desktop\\test\\test.txt"));
       /* FileOutputStream fos = new FileOutputStream("C:\\Users\\觋时雨\\Desktop\\test\\test.txt",true);
        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.write(100);
        fos.write(101);
        //byte[] bys = {97, 98, 99, 100, 101};
        byte[] bys = "abcde".getBytes();
        fos.write(bys,1,3);
        for (int i = 0; i < 5; i++) {
            fos.write("醉里挑灯看剑".getBytes());
            fos.write("\r\n".getBytes());
        }*/
        FileInputStream fis = new FileInputStream("C:\\Users\\觋时雨\\Desktop\\test\\test.txt");
        /*int by;
        while ((by=fis.read())!=-1){
            System.out.print((char)by);
        }*/
        byte[] bys = new byte[1024];
        int len;
        while ((len=fis.read(bys))!=-1){
            System.out.println(new String(bys,0,len));
        }


        fis.close();
    }
}
