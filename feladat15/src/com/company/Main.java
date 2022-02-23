package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);

        System.out.println("Adjon meg egy számot: ");// bekérjük az adatot
        int szam = konzol.nextInt();//eltároljuk az adatot


        if ((szam % 3 == 0 ) || (szam % 4 == 0) || (szam % 9 == 0)) {//megvizsgáljuk az adatot
            System.out.println("A szám osztható 3-al vagy 4-el vagy 9-el");
        }
        else {
            System.out.println("A szám nem osztható sem 3-al sem 4-el sem 9-el");
        }
    }
}
