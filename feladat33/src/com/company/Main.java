package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);

        System.out.print("Adj meg egy számot: ");//bekérjük az adatot
        int szam = konzol.nextInt();//eltároljuk az adatot


        int valami = 0; //valami egyenlő 0 val
        int szam1 = szam;// szam1 be eltároljuk a számot
        while (szam -3 > 0){//ciklus addig fusson amíg szam-3 nagyobb mint 0
            szam = szam - 3;//szam = szam-3
            valami ++;//valamit növelünk 1 el

        }
        System.out.printf("%d  =  %d * 3 + %d", szam1, valami, szam);//kiíratjuk a szamot
    }
}
