/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;

import java.util.Scanner;
public class Ejemplo08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int termino =0;
        
        System.out.println("Ingrese el tamaño de su arreglo: ");
            termino = entrada.nextInt();
            int[] arreglo = new int [termino];
            
            for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingresar el valor de la posicion " + i);
            arreglo[i] = entrada.nextInt();
        }

        System.out.printf("La suma es igual a: %s\n",
                misterio(arreglo, termino));
        
        // Ingresar por teclado el tamaño de un arreglo
        // Ingresar por teclado los valores enteros del arreglo
        // Sumar los valores del arreglo, mediante la función misterio
        
    }

    public static int misterio(int[] arreglo, int tamanio) {

        if (tamanio == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
        }
    }

}
