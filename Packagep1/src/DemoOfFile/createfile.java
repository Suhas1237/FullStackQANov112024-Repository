package DemoOfFile;

import java.io.File;

public class createfile {
    static void filecreate(){
        File f1=null;
        try {
            f1 = new File("D:\\Java\\Demo.txt");
            f1=new File("D:\\Java\\Pactice.txt");
            boolean v = f1.createNewFile();
            System.out.println("Is the file created: " + v);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        createfile.filecreate();
    }
}
