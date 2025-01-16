package DemoOfFile;

import java.io.File;

public class createfolder {
    static void folderDemo(String folderpath) {
        File f1 = new File(folderpath);
        f1.mkdir();
    }
    static void filedemo(String filepath){
        File f2=new File(filepath);
        f2.mkdir();
    }
        public static void main (String[]args){
        String folderpath="D:\\myfiles";
        String filepath="D:\\myfiles\\Welcome.txt";
            createfolder.folderDemo(folderpath);
            createfolder.filedemo(filepath);
        }
    }

