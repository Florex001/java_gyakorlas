package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);//Scanner létrehozása ami be olvas a bíllentyűzetről

        System.out.print("Adja meg az első számot: ");//Megkéri a felhasználót hogy milyen adatot vigyen be
        int szam1 = konzol.nextInt();//szam1 változóban eltárolja a megadott egész számot
        System.out.print("Adja meg a második számot: ");//Megkéri a felhasználót hogy milyen adatot vigyen be
        int szam2 = konzol.nextInt();//szam2 változóban eltárolja a megadott egész számot

        if (szam1 > szam2){//Megvizsgálja hogy a szam1 nagyobb e mint a szam2
            System.out.printf("A %d a nagyobbik szám", szam1);//ha igen ezt írja ki formázottan
        }
        else if (szam1 < szam2){//ha az előző feltétel nem teljesül akkor megvizsgálja hogy a szam2 nagyobb e mint a szam1
            System.out.printf("A %d a nagyobbik szám", szam2);//ha igen kiírja ezt
        }
        else {//különben a két szám egyenlő és ezt írja ki
            System.out.printf("A %d és %d szám egyenlő", szam1, szam2);
        }
    }
}
