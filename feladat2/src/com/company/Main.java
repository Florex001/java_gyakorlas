package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner konzol = new Scanner(System.in); //Scanner létrehozása ami be olvas a bíllentyűzetről

        System.out.print("Adja meg a nevét: ");//meg adja az utasítást printtel és egy sorba kerül majd a be olvasott név is
        String nev = konzol.nextLine();//el tárolja a Stringet a nev változóban és be olvas a következő sorból

        System.out.printf("Szia %s", nev);//formázott ki íratásban kiírja a szia + a nev változóban tárolt adatot
    }
}
