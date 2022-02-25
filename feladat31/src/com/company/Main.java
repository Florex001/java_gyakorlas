package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);

        int szam = 0;//adtam egy 0 a alapértéket

        System.out.print("Adj meg egy számot: ");//bekértem az adatot
        szam = konzol.nextInt();//eltároljuk a szam valtozóban

        System.out.printf("%d = ", szam);//kiírom az elejét

        while (szam % 2 == 0){//akkor fusson le a progrma ha szam páratlan
            szam = szam /2;//addíg fusson a program ameddíg az osztható 2 vel
            System.out.print("2*");//Annyiszor írja ezt ki amíg oszthat 2 vel
        }
        System.out.println(szam);//irja a * os után az hogy mennyiszer kell meg *ozni


    }
}
