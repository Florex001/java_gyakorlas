package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);

        System.out.print("Adja meg a pontszámot: ");//bekérjük a pontszámot
        double pontszam = konzol.nextDouble();//eltároljuk

        if (pontszam >= 0 && pontszam < 50){//végig vizsgáljuk a határokat
            System.out.println("elégtelen");
        }
        else if (pontszam >= 50 && pontszam < 65){
            System.out.println("elégséges");
        }
        else if (pontszam >= 65 && pontszam < 80){
            System.out.println("közepes");
        }
        else if (pontszam >= 80 && pontszam < 90){
            System.out.println("jó");
        }
        else if (pontszam >= 90 && pontszam <= 100){
            System.out.println("jeles");
        }
        else{
            System.out.println("nem megfelelő pontszám ! 1 és 100 között adjon értéket" );
        }
    }
}
