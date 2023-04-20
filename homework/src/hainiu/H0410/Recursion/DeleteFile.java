package hainiu.H0410.Recursion;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\觋时雨\\Desktop\\test - 副本");
        deleteF(file);
    }

    public static void deleteF(File fil) {
        if (!fil.exists()) {
            fil.delete();
            return;
        }
        File[] files = fil.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    file.delete();
                } else {
                    deleteF(file);
                }
            }
            fil.delete();
        }
    }
}
