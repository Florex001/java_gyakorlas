package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);

        System.out.print("Add meg az A átfogót: ");//Megkérjük a felhasználót milyen adatot vigyenbe
        double atfogoA = konzol.nextDouble();//eltároljuk az adatot
        System.out.print("Add meg a B átfogót: ");//Megkérjük a felhasználót milyen adatot vigyenbe
        double atfogoB = konzol.nextDouble();//eltároljuk az adatot

        double atfogoC = Math.sqrt((Math.pow(atfogoA, 2)) + (Math.pow(atfogoB,2)));//atfogoCben pitagorasz tételel kiszámoljuk az átfogót

        System.out.printf("Az átfogó mérete: %.2f", atfogoC);//kiírjuk az eredményt két tizedesjegyre
    }
}
