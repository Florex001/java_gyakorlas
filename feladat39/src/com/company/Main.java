package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);//létrehozunk egy konzol scannert

        System.out.print("Add meg a számot: ");//megkérjük milyen adatot vigyen be
        int szam = konzol.nextInt();//eltároljuk a szam változóban a be vitt adatot

        for (int i = 0; i <= szam; i++){//addíg fusson a ciklus amíg i kisebb egyenlő mint szam
            System.out.println(szam + i);//irja ki a szam + i eredményét
        }
    }
}
