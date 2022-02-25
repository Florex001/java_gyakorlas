package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);

        System.out.print("írd be hogy alma: ");
        String alma = konzol.nextLine();

        if (alma.equals("alma")){
            System.out.print("Az alma gyümölcs!");
        }
        else {
            System.out.printf("A %s nem gyümölcs!", alma);
        }
    }
}
