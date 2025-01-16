package DemoofString;

public class Question5 {
    static void answer() {
        String s = "Bangalore is garden city";
        StringBuilder s1 = new StringBuilder(s);;
            System.out.println("The length of string with space "+s1.length());
            String q=s.replace(" ","");
        System.out.println(q.length());
        }
    public static void main(String[] args) {
        Question5.answer();
    }
}
