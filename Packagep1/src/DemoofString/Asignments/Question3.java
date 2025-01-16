package DemoofString.Asignments;

public class Question3 {
    static void answer(){
        String s=new String("Mysore and Banglore");
        String b=s.substring(11,19);
        String m=s.substring(0,7);
        String a=s.substring(7,10);
        String l=s.substring(6,7);
        System.out.print(m);
        System.out.print(a);
        System.out.print(l);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Question3.answer();
    }
}
