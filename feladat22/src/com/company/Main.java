package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);

        System.out.print("Adja meg az órát: ");//meg kérjük a felhasználót vigye be az adatot
        int ora1 = konzol.nextInt();//eltároljuk a felvitt adatot
        System.out.print("Adja meg az percet: ");//meg kérjük a felhasználót vigye be az adatot
        int perc1 = konzol.nextInt();//eltároljuk a felvitt adatot
        System.out.print("Adja meg az másodpercet: ");//meg kérjük a felhasználót vigye be az adatot
        int mp1 = konzol.nextInt();//eltároljuk a felvitt adatot


        System.out.print("Adja meg az órát: ");//meg kérjük a felhasználót vigye be az adatot
        int ora2 = konzol.nextInt();//eltároljuk a felvitt adatot
        System.out.print("Adja meg az percet: ");//meg kérjük a felhasználót vigye be az adatot
        int perc2 = konzol.nextInt();//eltároljuk a felvitt adatot
        System.out.print("Adja meg az másodpercet: ");//meg kérjük a felhasználót vigye be az adatot
        int mp2 = konzol.nextInt();//eltároljuk a felvitt adatot


        int oramp1 = (ora1 * 60) * 60;//átváltjuk másodpercbe
        int percmp1 = (perc1 * 60);//átváltjuk másodpercbe

        int oramp2 = (ora2 * 60) * 60;//átváltjuk másodpercbe
        int percmp2 = (perc2 * 60);//átváltjuk másodpercbe

        int ossz = (oramp1 + percmp1 + mp1);//kiszámoljuk az első részt
        int ossz2 = (oramp2 + percmp2 + mp2);//kiszámoljuk a második részt

        if ((ora1 <= 24) && (perc1 <= 60) && (mp1 <= 60) && ((ora2 <= 24) && (perc2 <= 60) && (mp2 <= 60) )) {//ha az időpontok valóságnak megfelelnek akkor fusson le
            if (ossz <= 0) {
                System.out.printf("A két időpont között ennyi másodperc telt el: %d", ossz - ossz2 * (-1));
            } else {
                System.out.printf("A két időpont között ennyi másodperc telt el: %d", ossz - ossz2);
            }
        }
        else{//különben ez fusson le
            System.out.println("Nem jól megadott adatok! ");
        }
    }
}
