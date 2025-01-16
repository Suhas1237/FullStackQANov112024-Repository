package DemoofString.Asignments;

public class methodofStringBuilder {
    static void RevDemo() {
        StringBuffer s1 = new StringBuffer("Programming");
        char ch[] = new char[13];
        for (int i = s1.length() - 1; i >= 0; i--) {
            ch[i] = s1.charAt(i);
            System.out.print(ch[i]);
        }
    }
        public static void main (String[]args){
            methodofStringBuilder.RevDemo();
        }
    }

