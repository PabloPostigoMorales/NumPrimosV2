package org.example;

import java.util.Iterator;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el valor inicial:");
        Integer inicial = sc.nextInt();
        System.out.println("Indica el valor final:");
        Integer fin = sc.nextInt();
        var p = PrimoUtilities.primoIntervalo(inicial,fin);
        //System.out.println(PrimoUtilities.primoIntervalo(1,10));
        p.forEach(
                (entero) -> {System.out.println(entero);}
        );
        Iterator<Integer> it = p.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}