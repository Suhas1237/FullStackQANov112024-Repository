package p1;

public class IndependentclassInp1package {
    Protection o = new Protection();

    public IndependentclassInp1package() {
        o.public_d=5453;
        System.out.println("it is Independent classInp1package class constructor");
        // System.out.println("private_a:"+o.private_a);
        System.out.println("default_b:" + o.default_b);
        System.out.println("protected_c:" + o.protected_c);
        System.out.println("public_d:" + o.public_d);
    }
    public static void main(String[] args) {
        IndependentclassInp1package o4=new IndependentclassInp1package();
        o4.o.show();
    }
}
//for independent class create object of the another class here ,print object.name and you can also change value
// for method calling use thisclassobject(o4).objectofanotherclasscreatedhere(o).methodname
