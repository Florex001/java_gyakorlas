package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);
        System.out.print("adj meg egy számot: ");
        int szam = konzol.nextInt();

        if ((szam==1)||(szam ==2)){
            System.out.println("prím");
        }
        else if (szam %2==0){
            System.out.println("nem prím");
        }
        else {
            System.out.println("prím");
        }
    }
}
© 2022 GitHub, Inc.
Terms
