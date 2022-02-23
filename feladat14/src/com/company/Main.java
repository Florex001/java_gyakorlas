package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);

        System.out.print("Adja meg a körív sugarát: ");//bekérjük az adatot
        double r = konzol.nextDouble();//eltároljuk az adatot
        System.out.print("Adja meg a körív középponti szögét: ");//bekérjük az adatot
        double szog = konzol.nextDouble();//eltároljuk az adatot

        double terulet =((Math.pow(r,2) * szog)/2) - (Math.pow(r,2) * Math.sin(szog)/2) ;//teerületet számolunk
        double koriv =((Math.pow(r,2) * Math.PI) /2) * szog ;//korívet számolunk

        System.out.printf("A területe: %.2f \t Körív hossza: %.2f ", terulet, koriv);//formázottan tabulátor mellé kiírjuk
    }
}
