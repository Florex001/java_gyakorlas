package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);

        System.out.print("Adjon meg egy számot: ");//meg kérjük a felhasználót hogy adjon meg egy számot
        int szam = konzol.nextInt();//szam változóban eltároljuk azt a számot

        for (int i =1; i <=szam; i++){ //for ciklus lefuttatásával kiírjuk egymás alá a számokat addig amíg a i<=szam
            System.out.printf("\n" + i);
        }
    }
}
