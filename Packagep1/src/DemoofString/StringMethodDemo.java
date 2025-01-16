package DemoofString;

public class StringMethodDemo {
    static void lowwercase(){
        String s1="PROGRAMMING";
        System.out.println("lower case "+s1.toLowerCase());
    }
    static void uppercase(){
        String s1="hansini";
        System.out.println("uppercase "+s1.toUpperCase());
    }
    static void strlength(){
        String s1=new String("Trekking");
        System.out.println("Length "+s1.length());
    }
    static void convertString(){
        int a=422;
        String s1= String.valueOf(a);
        System.out.println(a);
        double d= 4232.53;
        String s2=String.valueOf(d);
        System.out.println(d);
    }
    static void extractChars(){
        String s1="Oracle";
        char ch=s1.charAt(2);
        System.out.println(ch);
    }
    static void convertCharArray(){
        String s1=new String("Elements");
        char ch[]=s1.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]+",");
        }
        System.out.println();

    }
    static void concateStr(){
        String s="Black";
        System.out.println(s.concat(" Hole"));
    }
    static void splitString(){
        String s="Mango Apple Banana Orange";
        String str[]=s.split(" ");
        for(String kk:str){
            System.out.println(kk);
        }
    }
    static void trimString(){
        String s="Just speak to your self";
        System.out.println(s.endsWith("self"));
        System.out.println(s.startsWith("Just"));
    }

    public static void main(String[] args) {
        StringMethodDemo.lowwercase();
        StringMethodDemo.uppercase();
        StringMethodDemo.strlength();
        StringMethodDemo.convertString();
        StringMethodDemo.extractChars();
        StringMethodDemo.convertCharArray();
        StringMethodDemo.concateStr();
        StringMethodDemo.splitString();
        StringMethodDemo.trimString();
    }
}
