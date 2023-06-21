package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Calculator {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader file = new FileReader(args[0]);
        Stats stats = new Stats();
        stats.calculator(file);

        System.out.println("Media: " + stats.getavg());
        System.out.println("Desviación estándar: " + stats.getdevstd());
    }
}
