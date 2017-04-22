package guiadeejercicios1;
import Classes.Methods;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

/**
 *
 * @author pwnd
 */
public class GuiaDeEjercicios1 {

    /*  M A I N  */
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Cuantos valores desea ingresar: ");
        int vector1Tam = in.nextInt();
        int [] vector1;
        vector1 = new int [vector1Tam];
        for(int index1 = 0; index1 < vector1Tam; index1++){
            System.out.println("Ingrese valor: ");
            vector1[index1] = in.nextInt();
        }
        System.out.print("El minimo de los valores ingresados es: ");
        System.out.print( Methods.posicionDelMaximoValorDelArray(vector1) );
    }   
}