package DemoofString;

import DemoofString.Asignments.Quetion4a;

public class Quetion4b {
        static void answerb() {
            String s = new String("PROGRAM");
            char ch[] = s.toCharArray();
            for (int i =0; i <ch.length; i++) {
                for(int j=0;j<=i;j++) {
                    System.out.print(ch[j] +" ");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            Quetion4b.answerb();
        }
    }

