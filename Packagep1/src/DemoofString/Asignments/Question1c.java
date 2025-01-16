package DemoofString.Asignments;

public class Question1c {
    static void answer(){
        String s=new String("Java");
        int j=s.length();
        for (int i=s.length()-1;i>=0;i--) {
            String a = s.substring(i,j);
            j--;
            System.out.print(a);
        }
    }
    public static void main(String[] args) {
        Question1c.answer();
    }
}
