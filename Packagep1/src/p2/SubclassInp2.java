package p2;

import p1.Protection;

public class SubclassInp2 extends Protection {
    public SubclassInp2(){
        System.out.println("it is the subclass in p2");
        //System.out.println("Private_a:"+private_a);
        //System.out.println("Default_b:"+default_b);
        System.out.println("Protected_c:"+protected_c);
        System.out.println("Public_d:"+public_d);
    }

    public static void main(String[] args) {
        SubclassInp2 o1=new SubclassInp2();
    }
}
// if u are in different package by creating object you could access public and protected members in subclass.