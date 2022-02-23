package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);

        System.out.print("Adjon meg egy számot: ");
        int szam = konzol.nextInt();

        int osszeg = 0;

        for (int i =1; i<=szam; i++){
            if ((szam % i) == 0){
                osszeg += i;//osszeget növeltük indexxel
            }
        }
        System.out.printf("Az osztóinak összege: %d" , osszeg);
    }
}
