package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);//Scanner létrehozása ami be olvas a bíllentyűzetről

        System.out.print("Adjon meg a kisebb pozitív egész számot: ");//Megkéri a felhasználót milyen adatot vigyen be
        double szam1 = konzol.nextInt();//A változóban eltárolja a be vitt adatot
        System.out.print("Adjon meg a nagyobb pozitív egész számot: ");//Megkéri a felhasználót milyen adatot vigyen be
        double szam2 = konzol.nextInt();//A változóban eltárolja a be vitt adatot

        double szamtani = (szam1 + szam2) / 2;//kiszámítja képlet alapján a számtani közepet
        double mertani = Math.sqrt(szam1 * szam2) ;//kiszámítja képlet alapján a mértani közepet

        System.out.printf("A két szám Számtani közepe: %.2f Mértani közepe: %.2f ", szamtani, mertani); //formázott kiíratással kiírjuk az eredményeket
    }
}
