package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);//konzol scanner

        System.out.print("Adja meg az első számot: ");//be kérjük milyen adat legyen
        int szam1 = konzol.nextInt();//eltároljuk
        System.out.print("Adja meg a második számot: ");//be kérjük milyen adat legyen
        int szam2 = konzol.nextInt();//eltároljuk

        int szam1f = szam1 % 10 * 10 + szam1 / 10;//megforditjuk
        int szam2f = szam2 % 10 * 10 + szam2 / 10;//megforditjuk

        if (szam1 * szam2 == szam1f * szam2f){
            System.out.println("páros speciális szám!");
        }else{
            System.out.println("Nem speciális szám!");
        }
    }
}
