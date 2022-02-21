package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);//meghívunk egy scannert hogy később tudjunk bekérni konzolról

        System.out.print("Adja meg az A együtthatót: ");//Bekérem az együtthatót
        double a = konzol.nextDouble();//Eltárolom a felhasználó által megadott számot
        System.out.print("Adja meg a B együtthatót: ");//Bekérem az együtthatót
        double b = konzol.nextDouble();//Eltárolom a felhasználó által megadott számot
        System.out.print("Adja meg a c együtthatót: ");//Bekérem az együtthatót
        double c = konzol.nextDouble();//Eltárolom a felhasználó által megadott számot

        double diszkrimináns = Math.sqrt(Math.pow(b,2)- 4 * a * c);//kiszámolom a diszkriminánst
        double x1 = (-b + Math.sqrt(Math.pow(b,2)- 4 * a * c) / 2*a);//x1 et számolok
        double x2 = (-b - Math.sqrt(Math.pow(b,2) -4 * a * c) / 2*a);//x2 őt számolok

        if (diszkrimináns >= 0){//ha diszkrimináns nagyobb vagy egyenlő nullával akkor van eredmény különben nincsen
            System.out.println("Van eredmény");
        }
        else {
            System.out.println("Nincs eredmény");
        }


    }
}
