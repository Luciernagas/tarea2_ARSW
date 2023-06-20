package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class stats {
    static List<Double> numbers = new MyLinkedList<Double>();

    public static void main() {
        numbers.add(15.0);
        numbers.add(69.9);
        numbers.add(6.5);

        System.out.println("Media: " + avg());
        System.out.println("Desviación estándar: " + devstd());
    }

    public static void calculator(String filePath){
        Path file = Paths.get(filePath);
        Charset charset = Charset.forName("UTF-8");
        try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
            String columna = null;
            while ((columna = reader.readLine()) != null) {
                Double elemento = Double.parseDouble(columna);
                numbers.add(elemento);
            }
            System.out.println("Media = " +avg());
            System.out.println("Desviación estándar = " +devstd());

        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }

    /**
     * Método el cual realiza las operaciones necesarias para el cálculo de la media de una lista de datos
     * @return el resultado del cálculo de la media
     */
    public static double avg(){
        int longitud = numbers.size();
        double sumaElementos = 0;

        for(int i = 0; i < longitud; i++){
            sumaElementos += numbers.get(i);
        }
        return sumaElementos / longitud;
    }

    /**
     * Método el cual realiza las operaciones necesarias para el cálculo de la desviación estándar de una lista de datos
     * @return el resultado del cálculo de la desviación estándar
     */
    public static double devstd(){
        int longitud = numbers.size();
        double sumaDiferenciaAlCuadrado = 0; // (n1-media)**2
        double media = avg();

        for (int i = 0; i < longitud; i++){
            double operacion = Math.pow((numbers.get(i) - media), 2);
        }

        return Math.sqrt(sumaDiferenciaAlCuadrado / longitud);
    }
}
