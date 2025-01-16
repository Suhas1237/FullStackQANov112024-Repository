package p2;

import p1.IndependentclassInp1package;
import p1.Protection;

public class IndependentclassInP2 {
    Protection o3=new Protection();
    public IndependentclassInP2(){
        System.out.println("it is the Independent class in p2");
        //System.out.println("private_a:"+private_a);
        //System.out.println("default_b:"+default_b);
        //System.out.println("protected_c:"+o3.protected_c);
        System.out.println("public_d:"+o3.public_d);

    }
      void  create(){
          System.out.println("it is create method");
        Protection o2=new Protection();
    }

    public static void main(String[] args) {
        IndependentclassInP2 o4=new IndependentclassInP2();
        o4.o3.public_d=64534;
        System.out.println(o4.o3.public_d);
        o4.create();
    }
}
// if u are in different package by creating object in this class ,you could access public members only in independent class.
//if you wanna change the values assigned to variables in another packages ,by creating object of this class(o4) and already you
//would have created object of for the class of another package(o3),o4.o3.variablename=assign value.