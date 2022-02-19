package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);//Scanner létrehozása ami be olvas a bíllentyűzetről

        System.out.print("Adja meg az első számot: ");//Meg kéri a felhasználót hogy milyen adatokat vigyen be
        double szam1 = konzol.nextDouble();//A be vitt adatot el tárolja a szam1 változóban
        System.out.print("Adja meg a második számot: ");//Meg kéri a felhasználót hogy milyen adatokat vigyen be
        double szam2 = konzol.nextDouble();//A be vitt adatot el tárolja a szam2 változóban

        double ossz = szam1 + szam2 ;//Az ossz változóban a szam1 et összeadja a szam2 vel
        double kulonbseg = szam1 - szam2 ;//a kulonbsg változóban szam1 et kivonja a szam2 ből
        double szorzat = szam1 * szam2 ;//szorzat változóban szam1 et megszorozzuk a szam2 vel
        double hanyados = szam1 / szam2 ;//hanyados változóban szam1 et elosztjuk szam2 vel

        System.out.println("A megadott számok eredményei (két tizedesjegyre kerekítve):");// kiíratjuk a következő szüveget
        System.out.printf("Összege: %.2f \t Különbsége: %.2f \t Szorzata: %.2f \t Hányadosa: %.2f:   ", ossz, kulonbseg, szorzat,hanyados);//formázottan kiírjuk az eredményeket
    }
}
