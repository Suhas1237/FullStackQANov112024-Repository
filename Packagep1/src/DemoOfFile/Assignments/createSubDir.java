package DemoOfFile.Assignments;

import java.io.File;

class subDemo{
    void createSubDir(String path){
            File f1 = new File(path);
            boolean v = f1.mkdir();
            System.out.println("Is the subdirectory created: "+v);
        }
    }
public class createSubDir {
    public static void main(String[] args) {
        File f2 = new File("D:\\Months");
        boolean v1 = f2.mkdir();
        System.out.println("Is the Directory created: " + v1);
        subDemo obj = new subDemo();
        String s[] = {"D:\\Months\\January", "D:\\Months\\February", "D:\\Months\\March","D:\\Months\\April","D:\\Months\\May","D:\\Months\\June","D:\\Months\\July","D:\\Months\\August",
                "D:\\Months\\September","D:\\Months\\October","D:\\Months\\November","D:\\Months\\December"};
        for (int i = 0; i < s.length; i++) {
            obj.createSubDir(s[i]);
        }
    }
}
