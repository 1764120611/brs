package hainiu.H0410.Recursion;

import java.io.File;

public class FileLength {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\觋时雨\\Desktop\\test");
        System.out.println(lengthF(file));
    }

    public static long lengthF(File fil) {
        long t = 0;
        if (!fil.exists()) {
            fil.delete();
            t += 0;
            return t;
        }
        File[] files = fil.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    t += file.length();
                } else {
                  t+=  lengthF(file);

                }
            }

        }
        return t;
    }
}
