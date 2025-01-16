package DemoofString;

public class methodsofStringBuffer {
    public static void main(String[] args) {
        methodsofStringBuffer.appendString();
        methodsofStringBuffer.insertString();
        methodsofStringBuffer.deleteString();
    }
        private static void appendString(){
            StringBuffer s= new StringBuffer("Java");
            System.out.println(s);
            s.append("Programming ");
            System.out.println(s);
        }
        private static void insertString(){
        StringBuffer s1=new StringBuffer("it is taking");
            System.out.println(s1);
            s1.insert(6,"breath");
            System.out.println(s1);
        }
        private static void deleteString(){
        StringBuffer s=new StringBuffer("one piece is not real");
            System.out.println(s);
            s.delete(13,16);
            s.insert(13,"damn");
            System.out.println(s);
        }
    }

