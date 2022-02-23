package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);

        System.out.print("Adja meg a testtömegét(kg): ");//bekéri az adatot
        double testtomeg = konzol.nextDouble();//eltárolja az adatot
        System.out.print("Adja meg a magasságát(m): ");//bekéri az adatot
        double magassag = konzol.nextDouble();//eltárolja az adatot

        double bmi = testtomeg / Math.pow(magassag,2);//kiszámolja a bmi indext
        System.out.println("Az ön bmi indexe: " + bmi);//kiírja az eredményt

        if (bmi < 18.5){
            System.out.println("Ön sovány!");
        }
        else if ((bmi > 18.5) && (bmi < 25)){
            System.out.println("Normál testsúly.");
        }
        else if ((bmi > 25) && (bmi < 30)){
            System.out.println("Ön túlsúlyos!");
        }
        else{
            System.out.println("Ön elhízott!");
        }
    }
}
