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
            int aleatorioA=rndm.nextInt(20);
            arregloA[indexA]=palabras[aleatorioA];
            
            int contadorA=arregloA[indexA].length()-1;
            while(contadorA>0){
                char letras = arregloA[indexA].charAt(contadorA);
                contadorA--;
                if(letras!=arregloA[indexA].charAt(contadorA)){
                    aleatorioA=rndm.nextInt(20);
                    arregloA[indexA]=palabras[aleatorioA];
                }
            }
        }
        for (int indexB = 0; indexB < cantidad; indexB++) {
            int aleatorioB=rndm.nextInt(20);
            arregloB[indexB]=palabras[aleatorioB];
            int contadorB=arregloB[indexB].length()-1;
            
            while(contadorB>0){
                char letras = arregloB[indexB].charAt(contadorB);
                contadorB--;
                if(letras!=arregloB[indexB].charAt(contadorB)){
                    aleatorioB=rndm.nextInt(20);
                    arregloB[indexB]=palabras[aleatorioB];
                }
            }
        }
        //impresion de pantalla
        System.out.println("Lista palabras palindroma arreglo A: ");
        for (int contListaA = 0; contListaA < cantidad; contListaA++) {
            System.out.println(arregloA[contListaA]);
        }
        System.out.println("Lista palabras palindroma arreglo B: ");
        for (int contListaB = 0; contListaB < cantidad; contListaB++) {
            System.out.println(arregloB[contListaB]);
        }
        System.out.println("Palabras del Arreglo A no están en el Arreglo B son: ");
        for (int contGeneral = 0; contGeneral < cantidad; contGeneral++) {
            if(!arregloA.equals(arregloB)){
                System.out.println(arregloA[contGeneral]);
            }
        }
    }
    
}
