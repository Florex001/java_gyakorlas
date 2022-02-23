package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);

        System.out.print("Adja meg az x1 kordinátát: ");//bekérjük az adatot
        double x1 = konzol.nextDouble();//eltároljuk az adatot
        System.out.print("Adja meg az x2 kordinátát: ");//bekérjük az adatot
        double x2 = konzol.nextDouble();//eltároljuk az adatot

        System.out.print("Adja meg az y1 kordinátát: ");//bekérjük az adatot
        double y1 = konzol.nextDouble();//eltároljuk az adatot
        System.out.print("Adja meg az y2 kordinátát: ");//bekérjük az adatot
        double y2 = konzol.nextDouble();//eltároljuk az adatot

        double tav = Math.sqrt(((x1 -x2) * (x1 - x2) + (y2 - y1) * (y2-y1)));//kiszámoljuk képlet alapján a távolságot

        System.out.printf("A két pont közötti távolság: %.2f ", tav);//kiírjuk
    }
}
