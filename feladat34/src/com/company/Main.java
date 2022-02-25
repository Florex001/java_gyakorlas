package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);


        System.out.print("Adj meg egy számot: ");//bekérjük az adatot
        int szam = konzol.nextInt();//eltároljuk az adatot

        if ((szam ==1) || (szam == 2)) {//ebben az esetben is prim
            System.out.println("prim");
        }
        else if (szam % 2   == 0){//ha szam osztható 2 vel maradék nélkül akkor nem prim
            System.out.println("nem prim");
        }
        else {
            System.out.println("prim");//különben minden esetben prim
        }
    }
}
