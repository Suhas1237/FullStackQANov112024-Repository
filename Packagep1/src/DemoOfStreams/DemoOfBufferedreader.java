package DemoOfStreams;

import java.io.BufferedReader;
import java.io.FileReader;

public class DemoOfBufferedreader {
    public static void main(String[] args) {
        readContent();
    }
    static void readContent(){
        FileReader fr=null;
        BufferedReader br=null;
        try {
            br = new BufferedReader(new FileReader("D:\\Java\\Study.txt"));
            String sline = null;
            while ((sline = br.readLine()) != null) {
                System.out.println(sline);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                br.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
