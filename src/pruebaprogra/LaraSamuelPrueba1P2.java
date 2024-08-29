/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaprogra;

import java.util.Random;
import java.util.Scanner;

public class LaraSamuelPrueba1P2 {

    public static void main(String[] args) {
        Random rndm = new Random();
        Scanner lea = new Scanner(System.in);
        
         String palabras [] = { "radar", "level", "world", "civic", "java",
                                "deified", "python", "rotor", "language", "madam", 
                                "refer", "stats", "noon", "hello", "moon", "wow",
                                "racecar", "kayak", "apple", "deed" };
         
        System.out.println("Ingresar el tamaño de los arreglos: ");
        int cantidad=lea.nextInt();
        
        String arregloA[]=new String[cantidad];
        String arregloB[]=new String[cantidad];
        
        for (int indexA = 0; indexA < cantidad; indexA++) {
            boolean esPalindromo = false;
            String palabra = "";

            while (!esPalindromo) {
                int aleatorioA = rndm.nextInt(palabras.length);
                palabra = palabras[aleatorioA];
                esPalindromo = true;

                int longitudA = palabra.length();
                for (int i = 0; i < longitudA / 2; i++) {
                    if (palabra.charAt(i) != palabra.charAt(longitudA - i - 1)) {
                        esPalindromo = false;
                        break;
                    }
                }
            }

            arregloA[indexA] = palabra;
        }
        
        for (int indexB = 0; indexB < cantidad; indexB++) {
            boolean esPalindromo = false;
            String palabra = "";

            while (!esPalindromo) {
                int aleatorioB = rndm.nextInt(palabras.length);
                palabra = palabras[aleatorioB];
                esPalindromo = true;

                int longitubB = palabra.length();
                for (int intPalindroma = 0; intPalindroma < longitubB / 2; intPalindroma++) {
                    if (palabra.charAt(intPalindroma) != palabra.charAt(longitubB - intPalindroma - 1)) {
                        esPalindromo = false;
                        break;
                    }
                }
            }

            arregloB[indexB] = palabra;
        }
        
        // Impresión de los arreglos
        System.out.println("Lista palabras palíndromas en el arreglo A:");
        for (int contListaA = 0; contListaA < cantidad; contListaA++) {
            System.out.println(arregloA[contListaA]);
        }
        
        System.out.println("Lista palabras palíndromas en el arreglo B:");
        for (int contListaB = 0; contListaB < cantidad; contListaB++) {
            System.out.println(arregloB[contListaB]);
        }
        
        // Mostrar palabras del arreglo A que no están en el arreglo B
        System.out.println("Palabras del arreglo A que no están en el arreglo B son:");
        for (int contListaA = 0; contListaA < cantidad; contListaA++) {
            boolean encontrada = false;
            for (int contListaB = 0; contListaB < cantidad; contListaB++) {
                if (arregloA[contListaA].equals(arregloB[contListaB])) {
                    encontrada = true;
                    break;
                }
            }
            if (!encontrada) {
                System.out.println(arregloA[contListaA]);
            }
        }
    }
    
}
