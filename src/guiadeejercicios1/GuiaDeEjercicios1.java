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
    
    /*Ejercicio 2*/
    
    /*Ejercicio 3*/
    
    public static boolean positivos(int [] arreglo){
        boolean limbo = true;
        for(int index = 0 ; index < arreglo.length; index++)
        {
            if (arreglo[index]> 0)
            
              limbo = true;
            
            else
                
              limbo = false;
            
        }
        return limbo;
    }
   
    
    
    
    
    
    
    
        
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
        System.out.print( GuiaDeEjercicios1.minimo(vector1) );
        
        
        /*Ejercicio 3*/
        System.out.print("Cuantos valores desea ingresar: ");
        int vector2Tam = in.nextInt();
        int [] vector2;
        vector2 = new int [vector2Tam];
        for(int index1 = 0; index1 < vector2Tam; index1++){
            System.out.println("Ingrese valor: ");
            vector2[index1] = in.nextInt();
        }
        boolean posiNiggi;
        posiNiggi = GuiaDeEjercicios1.positivos(vector2);
        if(posiNiggi == true){
            System.out.println("Todos Positivos");
        } else
        {
            System.out.println("No todos positivos");
        }
    }
    
}
