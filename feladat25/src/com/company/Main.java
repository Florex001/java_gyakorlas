package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);

        System.out.print("Adjon meg egy pozitív egész számot: ");
        int szam = konzol.nextInt();

        for (int i = 1; i<=szam;i++){//ha a számot maradékos osztással elosztjuk és 0 át kapunk azal a számmal osztható ésírja ki
            if ((szam % i) == 0){
                System.out.printf("A szám osztói: %d \n", i);
            }
        }
    }
}
