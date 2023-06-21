package org.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Stats {
    private static double media;
    private static double desviacion_estandar;

    public static void calculator(FileReader filePath){
        List<Double> numbers = new MyLinkedList<Double>();
        Path file = Paths.get(String.valueOf(filePath));
        Charset charset = Charset.forName("UTF-8");
        try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
            String columna = null;
            while ((columna = reader.readLine()) != null) {
                Double elemento = Double.parseDouble(columna);
                numbers.add(elemento);
            }
            media = avg(numbers);
            desviacion_estandar = devstd(numbers);

        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }

    /**
     * Método el cual realiza las operaciones necesarias para el cálculo de la media de una lista de datos
     * @return el resultado del cálculo de la media
     */
    public static double avg(List<Double> lista){
        int longitud = lista.size();
        double sumaElementos = 0;

        for(int i = 0; i < longitud; i++){
            sumaElementos += lista.get(i);
        }
        return sumaElementos / longitud;
    }

    /**
     * Método el cual realiza las operaciones necesarias para el cálculo de la desviación estándar de una lista de datos
     * @return el resultado del cálculo de la desviación estándar
     */
    public static double devstd(List<Double> lista){
        int longitud = lista.size();
        double sumaDiferenciaAlCuadrado = 0; // (n1-media)**2
        double media = avg(lista);

        for (int i = 0; i < longitud; i++){
            double operacion = Math.pow((lista.get(i) - media), 2);
        }

        return Math.sqrt(sumaDiferenciaAlCuadrado / longitud);
    }

    public static double getavg(){
        return media;
    }

    public static double getdevstd(){
        return desviacion_estandar;
    }
}
