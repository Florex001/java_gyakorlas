package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in);//Scanner létrehozása ami be olvas a bíllentyűzetről

        System.out.print("Adja meg a háromszöb A oldalát: ");//megkéri a felhasználót milyen adatot vigyen be
        double aold = konzol.nextDouble();//a változóban eltároljuk a be vitt adatot
        System.out.print("Adja meg a háromszöb B oldalát: ");//megkéri a felhasználót milyen adatot vigyen be
        double bold = konzol.nextDouble();//a változóban eltároljuk a be vitt adatot
        System.out.print("Adja meg a háromszöb C oldalát: ");//megkéri a felhasználót milyen adatot vigyen be
        double cold = konzol.nextDouble();//a változóban eltároljuk a be vitt adatot

        if ((aold + bold > cold) && (aold + cold > bold) && (bold + cold > aold)){//ha a oldal meg b oldal nagyobb mint c oldal és aoldal meg c oldal nagyobb mint boldal és boldal meg coldal nagyobb mint a oldal akkor meg szerkeszthető
            System.out.println("A hároszög megszerkeszthető!");//ha igaz a feltétl kiírja ezt
        }
        else{
            System.out.println("A háromszög nem szrkeeszthető meg!");// ha nem igaz a feltétel kiírja ezt
        }
    }
}
