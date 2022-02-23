package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);

        System.out.print("Adj meg egy számot: ");
        int szam = konzol.nextInt();

        int osszeg =0;

        for (int i = 1; i <= szam; i++){
            if ((szam % i) ==0){//ha a szám osztható i vel maradék nélkül akkor növelje osszeg értékét
                osszeg += i ;
            }
        }

        if ((szam * 2 ) == osszeg){//ha osszeg osztható 2 vel a szám tökéletes különben nem
            System.out.println("A megadott szám tökéletes!");
        }
        else {
            System.out.println("A szám nem tökéletes.");
        }
    }
}
