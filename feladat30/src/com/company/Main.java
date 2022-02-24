package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);

        double szam = 0;//szam nak 0 lesz az értéke
        while (szam < 10){//addig fusson a ciklus amig a be vitt szám kisebb
            System.out.print("Adj meg egy számot: ");//be kér egy számot
            szam =konzol.nextDouble();// eltárolja
        }
    }
}
