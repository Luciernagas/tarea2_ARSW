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
```
java -cp "./target/classes/" org.example.Calculator input_table_2.txt
```
![image](https://github.com/Luciernagas/tarea2_ARSW/assets/104604359/3be8c8b7-63db-4449-8887-e7cd958078c3)
Como es esperado el resultado es el mismo que en el documento.

## Diagrama de clase
![image](https://github.com/Luciernagas/tarea2_ARSW/assets/104604359/6da97159-2b7c-4ba1-9597-a6a03c3dab48)

Se puede observar que se tienen cuatro clases, la clase principal la cual es Calculator la cual posee el método main, el cual es quien permite que la aplicación se ejecute, por otro lado, se tiene la clase Stats, la cual es quien realiza la lectura del archivo y realiza las operaciones matemáticas necesarias para obtener la media y la desviación estándar, ahi será necesario el uso de una lista, por ello se creará un objeto de la clase MyLinkedList, el cual se nombrará numbers, este se puede observar en la relación entre dichas clases, esta es una clase con distintos métodos necesarios para realizar distintas acciones con la lista, las cuales se implementaron algunos de ellos, los cuales son necesarios para el funcionamiento de los métodos de cálculo de media y desviación estándar, por último no se puede dejar de lado que la clase Node, la cual es necesaria en la clase MyLinkedList porque se crean dos objetos de esta clase, firstNode y lastNode, los cuales serán necesarios para implementar métodos de la clase, estos al igual que numbers se pueden observar en la relación entre las clases.

## Licencia
Este proyecto esta autorizado bajo la licencia que se puede encontar en el archivo LICENSE.txt, en el se pueden encontrar los detalles

## Contribuidores
♡ Luisa Valentina De la hoz Rocha ♡
