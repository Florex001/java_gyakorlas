package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);//Scanner létrehozása ami be olvas a bíllentyűzetről

        System.out.print("Adja meg az első számot: ");//Meg kérjük a felhasználót milyen adatot vigyen be
        int szam1 = konzol.nextInt();//szam1 változóban eltároljuk az első be vitt adatot
        System.out.print("Adja meg az második számot: ");//Meg kérjük a felhasználót milyen adatot vigyen be
        int szam2 = konzol.nextInt();//szam2 változóban eltároljuk az második be vitt adatot
        System.out.print("Adja meg az harmadik számot: ");//Meg kérjük a felhasználót milyen adatot vigyen be
        int szam3 = konzol.nextInt();//szam3 változóban eltároljuk az harmadik be vitt adatot

        if ((szam1 < szam2) && (szam1 < szam3)){//ha szam1 kisebb mint szam2 és szam1 kisebb mint szam3 akkor írja ki a következőt
            System.out.printf("A %d szám a legkisebb!", szam1);//formázottan kiíratjuk ha ez a legkisebb
        }
        else if ((szam2 < szam1) && (szam2 < szam3)){//ha az előző feltétel nem felel meg akkor megvizsgálja ezt: szam2 kisebb mint szam1  és szam2 kisebb mint szam3 akkor írja ki a kövezkezőt
            System.out.printf("A %d szám a legkisebb!", szam2);//formázottan kiíratjuk ha ez a legkisebb
        }
        else if ((szam3 < szam1) && (szam3 < szam2)){//ha az előző feltétel nem felel meg akkor megvizsgálja ezt: a szam3 kisebb mint szam1 és szam3 kisebb mint szam2 akkor írja ki a következőt
            System.out.printf("A %d szám a legkiseb!", szam3);//formázottan kiíratjuk ha ez a legkisebb
        }
        else{
            System.out.print("A megadott számok egyenlőek!");//ha az előző feltételek nem felelnek meg akkor a megadott számok egyenlőek és ezt írja ki
        }
    }
}
