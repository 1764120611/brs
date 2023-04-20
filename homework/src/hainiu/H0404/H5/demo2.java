package hainiu.H0404.H5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class demo2 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.setProperty("username","root");
        prop.setProperty("password","123abc");
        prop.setProperty("url","www.hainiu.com");
        FileOutputStream out = new FileOutputStream("homework\\prop.properties");
        prop.store(out,"this is mysql resources message");
        out.close();
    }
}
