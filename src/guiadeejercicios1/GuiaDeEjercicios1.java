package guiadeejercicios1;
import java.util.Scanner;

/**
 *
 * @author pwnd
 */
public class GuiaDeEjercicios1 {
    
    /*Ejercicio 1*/
    
    public static int minimo(int [] array1){
    int aux = array1[0];
    for(int index = 0; index < array1.length; index++){
        if(array1[index] == aux){
             aux = array1[index];
            }
        }
    return aux;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Cuantos valores desea ingresar: ");
        int vector1Tam = in.nextInt();
        int [] vector1 = {0,0};
        for(int index1 = 0; index1 < vector1Tam; index1++){
            System.out.println("Ingrese valor: ");
            vector1[index1] = in.nextInt();
        }
        System.out.print("El minimo de los valores ingresados es: ");
        System.out.print( GuiaDeEjercicios1.minimo(vector1) );
        
    }
    
}
