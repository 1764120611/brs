package hainiu.H0404;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class H2 {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fis = new FileInputStream("C:\\Users\\觋时雨\\Desktop\\图\\合欢.jpg");
             FileOutputStream fos = new FileOutputStream("C:\\Users\\觋时雨\\Desktop\\test\\真中合欢.png");) {
            byte[] buffer = new byte[8192];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
