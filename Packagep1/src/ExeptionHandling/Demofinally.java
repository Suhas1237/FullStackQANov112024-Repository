package ExeptionHandling;

public class Demofinally {
    static void addition(int a,int b){
        System.out.println("add result is "+(a+b));
    }
    static void division(int a,int b){
        try{
            int res=a*b;
        }
       finally{
            int res = a *b;
            System.out.println(res);
        }
    }
    static void multiplication (int a ,int b){
        System.out.println("mult res "+a*b);
    }

    public static void main(String[] args) {
        Demofinally.addition(42,53);
        Demofinally.division(42,0);
        Demofinally.multiplication(53,53);
    }
}
//here in finally block as its an arithmetic exception,it gets out of the