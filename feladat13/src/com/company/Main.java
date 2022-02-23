package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);

        System.out.print("Adja meg a kör átmérőjét: ");//Felhasználó milyen adatot adjon meg
        double d = konzol.nextDouble();// eltároljuk az átmérőt

        double r = d / 2;//átmérőből kiszámoljuk a sugarat
        double T = Math.pow(r,2) * Math.PI;// kiszámoljuk a területet
        double K = 2 * r * Math.PI;//kiszámoljuk a kerületet

        System.out.printf("A kör terülte: %.2f \t kerülete: %.2f", T, K);//formázottan tabulátorral kiíratjuk az eredményt
    }
}
