package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);

        double szam = 0;

        do {
            System.out.print("Adj meg egy számot: ");
            szam = konzol.nextDouble();
        }while (szam <= 0);
    }
}
