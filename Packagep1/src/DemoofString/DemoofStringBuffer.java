package DemoofString;

public class DemoofStringBuffer {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("Just ");
        System.out.println(s);
        s.append("Live ");
        System.out.println(s);
    }
}
//string buffer creates memory in heap always and it does not support literal approach of object creation