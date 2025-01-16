package DemoofString.Asignments;

public class Question2 {
    static void answer(){
        String s1=new String("Language");
        int count=0;
        for(int i=0;i<s1.length();i++){
            count =count+1;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Question2.answer();
    }
}
