package DemoOfFile;

import java.io.File;
import java.sql.SQLOutput;

public class Demo {
    public static void main(String[] args) {
        File f1=new File("C:\\Demo\\Test\\Sample.txt");
        String name=f1.getName();
        System.out.println("File Name:"+name);
        File Path1=f1.getAbsoluteFile();
        System.out.println("File Path:"+Path1);
        String path2=f1.getPath();
        System.out.println(path2);
        File path3=f1.getParentFile();
        System.out.println(path3);
        boolean v=f1.isFile();
        System.out.println("Is it a File "+v);
        boolean v1=f1.isDirectory();
        System.out.println("Is it a Folder: "+v1);
        boolean v2=f1.canRead();
        System.out.println("Is file readable "+v2);
        boolean v3=f1.canWrite();
        System.out.println("Is file writable "+v3);
        boolean v4=f1.canExecute();
        System.out.println("Is the file executable "+v4);
    }
}
