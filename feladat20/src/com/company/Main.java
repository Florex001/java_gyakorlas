package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);

        System.out.print("Adja meg az első kisebb számot: ");//be kérjük az adatot
        int szam1 = konzol.nextInt();//ltároljuk az adatot
        System.out.print("Adja meg a második nagyobb számot: ");//be kérjük az adatot
        int szam2 = konzol.nextInt();//ltároljuk az adatot
        for( int i = 0; i != 3; i++ ) {//for ciklussal gnerálunk 3 random számot és kiírjuk őket
            int veletlen = (int) ((Math.random()* szam2) + szam1);
            System.out.println(veletlen);

        }
    }
}
