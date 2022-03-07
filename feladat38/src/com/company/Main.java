package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);//létrehozok egy konzol scannert

        System.out.print("Adj meg egy számot: ");//megkérem milyen adatot vigyen fel
        int szam = konzol.nextInt();//eltárolom a szam változóba

        for (int i = 1; i <= 10; i++ ){//addig menjen a ciklus amíg i kisebb vagy egyenlő mint 10
            System.out.println(szam * i);//amíg fut a ciklus írja ki ezt
        }
    }
}
