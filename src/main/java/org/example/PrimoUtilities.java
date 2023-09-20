package org.example;

import java.util.ArrayList;

public class PrimoUtilities {

    public static Boolean esPrimo(Integer numero){
        for (Integer n =2; n<(numero-1);n++){
            if (numero%2 ==0) return false;
        }
        return true;
    }
    public static ArrayList<Integer> primoIntervalo(Integer inicial, Integer fin){
        var salida = new ArrayList<Integer>();
        for (Integer numero=inicial;numero<fin;numero++){
            if (esPrimo(numero))salida.add(numero);
        }
        return salida;
    }
}
