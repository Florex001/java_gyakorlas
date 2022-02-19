package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);//Scanner létrehozása ami be olvas a bíllentyűzetről

        System.out.print("Adjon meg egy számot amit meg akar kétszerezni: "); //kiírja hogy mit kér majd a felhasználótol
        double szam1 = konzol.nextDouble();//double-be létrehozok egy változót szam1 néven és ebbe fogja tárolni a billentyűzetről be vitt számot
        double ossz = szam1 * 2;//ossz változóban fogja tárolni azt a számot ami szam1 * 2 vel
        System.out.printf("A megadott szám kétszerese két tizedesjegyre kerekítve: %.2f", ossz);//formázottan kiírja az eredményt két tizedesjegyre kerekítve
    }
}
