package DemoOfStreams;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        write();
    }
    static void write(){
        FileOutputStream fout=null;
        try {
            fout = new FileOutputStream("D:\\Java\\Welcomes.txt");
            String str = "Welcome to java .";
            str += "Java is Programming Language";
            byte b[] = str.getBytes();
            fout.write(b);
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                fout.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
