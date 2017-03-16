package guiadeejercicios1;
import java.util.Scanner;

/**
 *
 * @author pwnd
 */
public class GuiaDeEjercicios1 {
    
    /*Ejercicio 1*/
    
    public static int maximo(int [] array1){
    int aux = array1[0];
    for(int index = 0; index < array1.length; index++){
        if(array1[index] > aux){
             aux = array1[index];
            }
        }
    return aux;
    }
    
    /*Ejercicio 2*/
    
    public static int minimo(int [] array1){
    int aux = array1[0];
    for(int index = 0; index < array1.length; index++){
        if(array1[index] == aux){
             aux = array1[index];
            }
        }
    return aux;
    }
    
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
   
    /*Ejercicio 4*/
    
    public static int calculoBoleanos(boolean [] arrayBoole){
        int contadorPar = 0;
        int contadorInpar = 0;
        for(int index = 0; index < arrayBoole.length; index++){
            
            if( (index % 2) == 0 || arrayBoole[index] == true){
                contadorPar++;
            } else if( (index % 2) != 0 || arrayBoole[index] == false) {
                contadorInpar++;
            }
        }
            return contadorPar * contadorInpar;
    }
    
    /*Ejercicio 5*/
    
    //Puede un metodo devolver un arreglo? y si se puede como se hace?
    
    public static int mixedArrays(int [] arreglo1, int [] arreglo2){
        int leng;
        if (arreglo1.length > arreglo2.length){
            leng = arreglo1.length;
        } else{
            leng = arreglo2.length;
        }
        
        int [] aux;
        aux = new int[leng];
        for(int index = 0; index < arreglo1.length; index++){
            if( index%2 != 0 ){
                aux[index] = arreglo1[index];
            }
        }
        for(int index = 0; index < arreglo2.length; index++){
            if( index%2 == 0 ){
                aux[index] = arreglo2[index];
            }
        }
        return aux;
    }
    
    
        
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        /*Ejercicio 1*/
       
        System.out.print("Cuantos valores desea ingresar: ");
        int vector1Tam = in.nextInt();
        int [] vector1;
        vector1 = new int [vector1Tam];
        for(int index1 = 0; index1 < vector1Tam; index1++){
            System.out.println("Ingrese valor: ");
            vector1[index1] = in.nextInt();
        }
        System.out.print("El minimo de los valores ingresados es: ");
        System.out.print( GuiaDeEjercicios1.maximo(vector1) );
 
        /*Ejercicio 2*/
        
        System.out.print("Cuantos valores desea ingresar: ");
        int vector2Tam = in.nextInt();
        int [] vector2;
        vector2 = new int [vector2Tam];
        for(int index1 = 0; index1 < vector2Tam; index1++){
            System.out.println("Ingrese valor: ");
            vector2[index1] = in.nextInt();
        }
        System.out.print("El minimo de los valores ingresados es: ");
        System.out.print( GuiaDeEjercicios1.minimo(vector1) );
        
        /*Ejercicio 3*/
        
        System.out.print("Cuantos valores desea ingresar: ");
        int vector3Tam = in.nextInt();
        int [] vector3;
        vector3 = new int [vector3Tam];
        for(int index1 = 0; index1 < vector3Tam; index1++){
            System.out.println("Ingrese valor: ");
            vector3[index1] = in.nextInt();
        }
        boolean posiNiggi;
        posiNiggi = GuiaDeEjercicios1.positivos(vector3);
        if(posiNiggi == true){
            System.out.println("Todos Positivos");
        } else
        {
            System.out.println("No todos positivos");
        }
        
        /*Ejercicio 4*/
        
        System.out.print("Cuantos valores desea ingresar: ");
        int vector4Tam = in.nextInt();
        boolean [] vector4;
        vector4 = new boolean [vector4Tam];
        for(int index1 = 0; index1 < vector4Tam; index1++){
            System.out.println("Ingrese valor: ");
            vector4[index1] = in.nextBoolean();
        }
        int resultado;
        resultado = GuiaDeEjercicios1.calculoBoleanos(vector4);
        System.out.println("El producto: " +resultado);   
        
        
        /*Ejercicio 5*/
        
    }
    
}
