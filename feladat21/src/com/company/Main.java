package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner konzol = new Scanner(System.in);

        System.out.print("Adja meg a a terület szélességét(m): ");// bewkérjük az adatot
        double tszel = konzol.nextDouble();//eltároljuk az adatot
        System.out.print("Adja meg a terület magasságát(m): ");// bewkérjük az adatot
        double tmag = konzol.nextDouble();//eltároljuk az adatot

        double T = tszel * tmag;//számolunk egy területet
        double csempe = 0.2 * 0.2;//csempe területet
        double osszes = T / csempe;// terület el osztva csempe területtel
        double osszeg = osszes * 1.10;//+10% rászámolása

        System.out.printf("Az összes csempe amire szüksége lesz(+10): %.2f " ,osszeg);//két tizedesjegyel való kiíratás
    }
}
