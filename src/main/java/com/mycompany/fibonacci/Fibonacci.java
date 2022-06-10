package com.mycompany.fibonacci;

import java.util.ArrayList;

/**
 *
 * @author radaz
 */
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(CalcularSerie(6));
    }

    public static ArrayList<Integer> CalcularSerie(int n) {
        int num1 = 0, num2 = 1, suma = 1;
        ArrayList<Integer> serie = new ArrayList<>();
        serie.add(num1);  
        for (int i = 1; i < n; i++) {
            serie.add(suma);
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        }
        return serie;
    }
}
