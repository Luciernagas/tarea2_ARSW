## TAREA DE ANALISIS Y DISEÑO DE SISTEMAS OO
## 20 de junio del 2023

### Prerrequisitos
Se debe instalar Maven y registrarse en GITHUB
* Descargar maven en  http://maven.apache.org/download.html

### Ejecutando las pruebas
Para las pruebas se utilizó los ejemplos dados en el documento:
![image](https://github.com/Luciernagas/tarea2_ARSW/assets/104604359/d66305f9-727f-47aa-8455-d8b32e0a4966)

La estrucutura para ejecutar la prueba es la siguiente:
```
java -cp "./target/classes/" org.example.Calculator "archivo el cual se desea hacer los cálculos"
```

En este caso, se tienen dos archivos .txt dentro del repositorio para realizar las pruebas, los cuales son input_table_1.txt y input_table_2.txt
* Primero se realizará la prueba con el archivo input_table_1.txt:
```
java -cp "./target/classes/" org.example.Calculator input_table_1.txt
```
![image](https://github.com/Luciernagas/tarea2_ARSW/assets/104604359/6e0d5e02-c54a-4415-bf97-3a630d5fb810)
Se puede observar comparando con la imagen del documento que el resultado es el esperado.

* La segunda prueba se realizara con el archivo input_table_2.txt:
