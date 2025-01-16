package DemoOfStreams;

import java.io.FileReader;

public class DemoOfFileWriter {
    public static void main(String[] args) {
        readcontent();
    }
    static void readcontent() {
        FileReader fr = null;
        int n = 0;
        try {
            fr = new FileReader("D:\\Java\\Welcomes.txt");
            while (true) {
                fr.read();
                if (n == -1)
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
