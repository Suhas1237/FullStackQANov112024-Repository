package p1;

public class subclassInp1package extends Protection{
    public subclassInp1package(){
        public_d=423;
        default_b=6453;
        System.out.println("it is  subclassInp1package class constructor");
       // System.out.println("private_a:"+private_a);
        System.out.println("default_b:"+default_b);
        System.out.println("protected_c:"+protected_c);
        System.out.println("public_d:"+public_d);
    }

    public static void main(String[] args) {
        subclassInp1package o6=new subclassInp1package();
    }
}
// private members are accessible within class only.
//you can change the assigned values in subclass.