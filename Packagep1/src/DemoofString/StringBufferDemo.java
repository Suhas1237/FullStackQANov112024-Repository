package DemoofString;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("Java");
        System.out.println(s);
        s.append("Programming ");
        System.out.println(s);
    }

    public static class DemoofStringBuilder {
        public static void main(String[] args) {

            StringBuilder s = new StringBuilder("Java");
            System.out.println(s);
            s.append(" Programming");
            System.out.println(s);
            s.append(" Language");
            System.out.println(s);
        }
    }
}
