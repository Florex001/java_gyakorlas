package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);
        System.out.print("adj meg egy számot: ");
        int n = konzol.nextInt();


        for(int j = 1; j <= n; j++) {
            /*boolean prim = true;
            for (int i = 2; i < Math.sqrt(j); i++) {
                if (j % i == 0) {
                    prim = false;
                }
            }
            if (j < 2) {
                prim = false;
            }
            if (prim) {
                System.out.println(j);
            }*/
            boolean prim = true;
            if((j < 2) || (j % 2 == 0)){
                prim = false;
            }
            else {
                int i = 3;
                while((i <= Math.sqrt(j)) && prim){
                    if(j % i == 0){
                        prim = false;
                    }
                    i+=2;
                }
            }
            if(prim){
                System.out.println(j);
            }
        }
    }
}
