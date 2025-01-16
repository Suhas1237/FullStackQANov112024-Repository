package ExeptionHandling;

 class Demo {
     static void arithmetics() {
         System.out.println("Arithmetic operators are");
     }
     static void addition(int a, int b) {
         System.out.println("the sum is:" + (a + b));
     }
         static void division ( int a, int b) {
               try {
                   int result = a / b;
                   System.out.println("The division result is:" + result);
               }
               catch(ArithmeticException e)
               {
                   e.printStackTrace();
               }
     finally{
                 System.out.println("it executes");
             }
         }
     static void showEvenNumbers() {
         int i = 0;
         for (i = 1; i <= 10; i++) {
             int rm = i % 2;
             if (rm == 0) {
                 System.out.println(i + " ");
             }
         }
     }
     static void multiplication(int a, int b) {
         System.out.println("The multiplication result is:" + (a * b));
     }
 }
     public  class Practice1{
         public static void main(String[] args) {
            Demo.addition(42,53);
             Demo.division(423,0);
             Demo.showEvenNumbers();
             Demo.multiplication(43,65);
         }
     }



