package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);

        System.out.print("Adja meg a hatványalapot: ");
        double alap = konzol.nextDouble();
        System.out.print("Adja meg a hatványkitevőt: ");
        double kitevo = konzol.nextDouble();

        double hatvanyertek = Math.pow(alap, kitevo);

        System.out.printf("Hatványérték: %.2f", hatvanyertek);
    }
}
