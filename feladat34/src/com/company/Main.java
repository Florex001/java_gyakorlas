package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);
        System.out.print("adj meg egy számot: ");
        int n = konzol.nextInt();

        boolean prim = true;

        for(int i = 2; i < Math.sqrt(n); i++){
           if(n % i == 0){
               prim = false;
           }
        }
        if(n<2){
            prim = false;
        }
        if(prim == true){
            System.out.println("prímszám");
        }else{
            System.out.println("nem prim szám");
        }


    }
}

