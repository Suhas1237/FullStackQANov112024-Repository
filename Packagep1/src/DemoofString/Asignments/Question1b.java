package DemoofString.Asignments;

public class Question1b {
    static void answer2() {
        String s1 = new String("Language");
        char ch[] = new char[15];
        ch = s1.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
    }
    public static void main(String[] args) {
        Question1b.answer2();
    }
}
