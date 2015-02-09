package ovss.math_em;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void play() {
        Num n = new Num(20, 5);
        System.out.println(n.ans);

        Random random = new Random();

        int wrfact1 = 0;
        int wrfact2 = 0;
        int wrfact3 = 0;
        int wrfact4 = 0;

        boolean check = false;
        while (!check) {
            wrfact1 = random.nextInt(n.ans - 3) + 3;
            wrfact2 = random.nextInt(wrfact1 - 1) + 1;
            wrfact3 = random.nextInt(n.ans - 3) + 3;
            wrfact4 = random.nextInt(wrfact3 - 1) + 1;

            if (wrfact1*wrfact2 != n.ans) {
                if (wrfact3*wrfact4 != n.ans) {
                    check = true;
                }
            }
        }

        int pos = random.nextInt(3-1)+1;
        if (pos == 1) {
            System.out.println(n.getRightExp() + "x" + n.fact1);
            System.out.println(wrfact1 + "x" + wrfact2);
            System.out.println(wrfact3 + "x" + wrfact4);
        }else{if (pos == 2 ) {
            System.out.println(wrfact1 + "x" + wrfact2);
            System.out.println(n.getRightExp() + "x" + n.fact1);
            System.out.println(wrfact3 + "x" + wrfact4);
        }else {
            System.out.println(wrfact1 + "x" + wrfact2);
            System.out.println(wrfact3 + "x" + wrfact4);
            System.out.println(n.getRightExp() + "x" + n.fact1);
        }}

    }
}
