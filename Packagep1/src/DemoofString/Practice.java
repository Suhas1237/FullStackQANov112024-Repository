package DemoofString;

public class Practice {
    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer("Java");
        System.out.println(s1);
        s1.append("Programming");
        System.out.println(s1);
       // s1.concat("Language");
       // System.out.println(s1);
    }
}
//when you use string literal method ,it creates object in the constant pool ,in constant pool it never accepts
//same content ,if there are same content objects ,it provides the result of 1st object itself.