package org.example;

public class Calculator {
    public static void main(String[] args){
        Stats stats = new Stats();
        stats.calculator(args[0]);

        System.out.println("Media: " + stats.getavg());
        System.out.println("Desviación estándar: " + stats.getdevstd());
    }
}
