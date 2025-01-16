package DemoofString.Asignments;

public class Quetion4a {
    static void answer() {
        String s = new String("PROGRAM");
        char ch[] = s.toCharArray();
        for (int i = ch.length; i >=0; i--) {
            for(int j=0;j<i;j++) {
                System.out.print(ch[j] +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Quetion4a.answer();
    }
}
