# Práctica 2 - Búsqueda Binaria en Java

## Información General

- **Título:** Búsqueda Binaria  
- **Número de práctica:** 2  
- **Asignatura:** Estructura de Datos  
- **Carrera:** Computación  
- **Estudiante:** Sebastian Loza  
- **Fecha:** 21/04/2025  
- **Profesor:** Ing. Pablo Torres

---

## Descripción

Esta práctica implementa el algoritmo de búsqueda binaria en Java utilizando objetos `Persona`, ordenados previamente por edad mediante el método de ordenamiento Insertion Sort.

Durante la ejecución se muestra:
- El arreglo ordenado por edades.
- Los valores de los índices: bajo, alto, centro y valorCentro.
- La dirección de búsqueda (izquierda o derecha).
- Si el elemento fue encontrado o no.

---

## Ejecución

Para compilar y ejecutar el proyecto:

1. Compila el código:
   ```bash
   javac App.java
2. Ejecuta la aplicación:
    ```bash
    java App

## Ejemplo de entrada 

Ingrese cantidad de Personas del listado: 9
```text
Ingrese Persona:
Nombre: Pablo
Edad: 4

Ingrese Persona:
Nombre: Maria
Edad: 5

Ingrese Persona:
Nombre: Juan
Edad: 18

Ingrese Persona:
Nombre: David
Edad: 60

Ingrese Persona:
Nombre: Mateo
Edad: 25

Ingrese Persona:
Nombre: Diego
Edad: 12

Ingrese Persona:
Nombre: Ana
Edad: 8

Ingrese Persona:
Nombre: Alicia
Edad: 9

Ingrese Persona:
Nombre: Jaime
Edad: 40

Valor de la persona de la edad: 18
```

## Salida esperada

``` txt
4 | 5 | 8 | 9 | 12 | 18 | 25 | 40 | 60

bajo=0 alto=8 centro=4 valorCentro=12 --> DERECHA  
18 | 25 | 40 | 60  
bajo=5 alto=8 centro=6 valorCentro=25 --> IZQUIERDA  
18 |  
bajo=5 alto=5 centro=5 valorCentro=18 --> ENCONTRADO  
La persona con la edad 18 es Juan
```

## Instrucciones

1. Crear una clase `Persona` con los atributos:
   - `nombre`
   - `edad` (no debe ser negativa)

2. Ingresar un listado de personas desde teclado.

3. Ordenar las personas por edad usando `Insertion Sort`.

4. Solicitar una edad a buscar.

5. Implementar búsqueda binaria para encontrar la **primera persona** con esa edad.

6. Mostrar durante la búsqueda:
   - El arreglo ordenado por edades.
   - Posiciones: `bajo`, `alto`, `centro`, `valorCentro`.
   - Dirección de búsqueda: izquierda o derecha.
   - Si el elemento fue encontrado o no.

## Resultados obtenidos

- Conocimiento de los métodos de búsqueda.

- Determinación del funcionamiento de la búsqueda binaria.

- Aplicación de estructuras de datos usando clases y objetos en Java.

- Implementación de ordenamiento por Insertion Sort.

## CONCLUSIONES

- Cada estudiante conocerá el procedimiento de búsqueda binaria.

- Se reforzará el uso de estructuras y algoritmos en Java.

- Se aplicarán validaciones y buenas prácticas en la entrada de datos.



