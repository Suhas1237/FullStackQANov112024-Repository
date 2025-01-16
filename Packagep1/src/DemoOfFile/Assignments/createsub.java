package DemoOfFile.Assignments;

import java.io.File;

class Q1 extends createsub{
    static void show(String path) {
        File f1 = new File(path);
        boolean v1 = f1.mkdir();
        System.out.println("Is directory created: " + v1);
    }
}
 public class createsub {
    public static void main(String[] args) {
        Q1 f=new Q1();
        File f2=new File("D:\\Demo");
        boolean v2=f2.mkdir();
        System.out.println("Is folder created: "+v2);
        String s[]={"D:\\Demo\\1","D:\\Demo\\2","D:\\Demo\\3","D:\\Demo\\4","D:\\Demo\\5","D:\\Demo\\6","D:\\Demo\\7"};
        for(int i=0;i<s.length;i++){
            f.show(s[i]);
        }
    }
}

