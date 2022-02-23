package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);

        System.out.print("Adja meg az A oldalt: ");// megkérjük a felhasználót vigye fel az adatot
        double a = konzol.nextDouble();//eltároljuk a felvitt adatot
        System.out.print("Adja meg a B oldalt: ");// megkérjük a felhasználót vigye fel az adatot
        double b = konzol.nextDouble();//eltároljuk a felvitt adatot
        System.out.print("Adja meg a C oldalt: ");// megkérjük a felhasználót vigye fel az adatot
        double c = konzol.nextDouble();//eltároljuk a felvitt adatot

        double V = a * b * c;// kiszámoljuk a térfogatot
        double A = 2 * (a*b + a*c + b*c);//kiszámoljuk a felszínt

        System.out.printf("A felszíne: %.2f \t A térfogata: %.2f ", A, V);//formázottan kiírjuk tabulátorral elválasztva


    }
}
