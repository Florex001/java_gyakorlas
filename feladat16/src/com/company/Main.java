package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);

        System.out.print("Adja meg a hőmérsékletet: ");//be kérjük az adatot
        double homerseklet = konzol.nextDouble();//eltároljuk az adatot

        double FbolC = ((homerseklet - 32) / 9) * 5;//Fahrenheit átváltása Celsiusra

        double CbolF = ((homerseklet / 5) * 9 )+32;//Celsius átváltása Fahrenheitre

        System.out.print("Nyomj 0-at ha Celsius átváltása Fahrenheitre \nNyomj 1-est ha Fahrenheit átváltása Celsiusra");
        int dontes = konzol.nextInt();//meg kérjük hogy válasszon miből szeretné mibe váltani

        if(dontes == 0){//ha 0 értéket visz be akkor CbolF érték jelenik meg
            System.out.printf("Fahrenheit: %.2f", CbolF);
        }
        else if (dontes == 1){//ha 1 es értéket visz be akkor FbolC érték jelenik meg
            System.out.printf("Celsius: %.2f" , FbolC);
        }
        else {//ha egyiknek se felel meg a felhasználó rossz adatot adott meg
            System.out.println("nem jól megadott érték!");
        }

    }
}
