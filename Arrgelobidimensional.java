/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrgelobidimensional;

/**
 *
 * @author sanchezericku
 */
public class Arrgelobidimensional {

    public static void main(String[] args) {
        // Crear un arreglo bidimensional de 3x5
        char[][] arreglo = new char[3][5];

        // Llenar el arreglo con letras
        char letra = 'a';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                arreglo[i][j] = letra;
                letra++;
            }
        }

        // Imprimir el resultado
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arreglo[i][j]);
            }
            System.out.println(); // Nueva línea después de cada fila
        }
    }
}
