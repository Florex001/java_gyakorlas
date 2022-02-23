package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);//konzol scanner létrehozása

        System.out.print("Adjon meg egy számot: ");//megkérjük a felhasználót hogy milyen adatot vigyenbe
        int szam = konzol.nextInt();//szam változóban el tároljuk a be vitt adatot

        for (int i  = 1; i  <= szam; i++){//for ciklussal végig kiírjuk hogy milyen számok vannak a meg adott szám előtt
            System.out.printf(" " + i );
        }
    }
}
