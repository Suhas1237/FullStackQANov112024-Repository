package DemoOfStreams;

import java.io.FileInputStream;
import java.io.IOException;

 class FileInputStreamDemo {
     public static void main(String[] args) {
         readContent();
     }
     static void readContent() {
         FileInputStream fin = null;
         int n = 0;
         try {
             fin = new FileInputStream("D:\\Java\\Demo.txt");
             while (true) {
                 fin.read();
                 if (n == -1)
                     break;
             }
         } catch (Exception e) {
             e.printStackTrace();
         } finally {
             try {
                 fin.close();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }
     }
 }

