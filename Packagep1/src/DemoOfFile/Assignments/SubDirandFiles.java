package DemoOfFile.Assignments;

import javax.swing.text.Style;
import java.io.File;

class dirSubfiles {
    void createSubFile(String path) {
        File f = new File(path);
        boolean v = f.mkdir();
        System.out.println("Is subfile created: " + v);
    }

    void createfiles(String path1) {
        try {
            File f1 = new File(path1);
            boolean v1 = f1.createNewFile();
            System.out.println("Is Text file created: " + v1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
    public class SubDirandFiles {
        public static void main(String[] args) {
            dirSubfiles o = new dirSubfiles();
            o.createSubFile("D:\\Fruits");
            String s2[] = {"D:\\Fruits\\Mango", "D:\\Fruits\\Banana", "D:\\Fruits\\Pineapple", "D:\\Fruits\\Apple", "D:\\Fruits\\Orange"};
            for (int i = 0; i < s2.length; i++) {
                o.createSubFile(s2[i]);
            }
            String s1[] = {"D:\\Fruits\\f1.txt", "D:\\Fruits\\f2.txt", "D:\\Fruits\\f3.txt", "D:\\Fruits\\f4.txt"};
            for (int i = 0; i < s1.length; i++) {
                o.createfiles(s1[i]);
            }
        }
    }
