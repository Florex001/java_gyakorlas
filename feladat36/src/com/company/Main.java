package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);// létrehozunk egy scannert

        System.out.print("Add meg az első számot: ");//megkérjük milyen adatot vigyen fel
        int a = konzol.nextInt();//el tároljuk a be vitt adatot
        System.out.print("Add meg a második számot: ");//megkérjük milyen adatot vigyen fel
        int b = konzol.nextInt();//el tároljuk a be vitt adatot

        int x = a;//x nek az értéke a
        int y = b;//y értéke b
        int m = 0;//m értéke 0


        //hátultesztelő
        do {
            m = a % b;
            a = b;
            b = m;
        }while (m != 0);//addíg fusson amíg m nem egyenlő 0-val

        System.out.printf("lnko: %d ", a);//kiírjuk

    }
}
