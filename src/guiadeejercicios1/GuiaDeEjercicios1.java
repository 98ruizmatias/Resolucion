package guiadeejercicios1;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

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
    
    public static int[] mixedArrays(int [] arreglo1, int [] arreglo2){
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
    
    /*Ejercicio 6*/
    
    /*Ejercicio 7*/
    
    /*Ejercicio 8*/
    
    /*Ejercicio 9*/
    
    /*Ejercicio 10*/
   
    /*Ejercicio 11*/

    public static int buscadorNum(int [] array11, int num){
        int resultado = 0;
        for(int index = 0; index < array11.length; index++ ){
            if(array11[index] == num){
                resultado = index;
            }
        }
        return resultado;
    }

    /*Ejercicio 12*/



    /*  M A I N  */
    
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
        
        /*Ejercicio 6*/
        
        System.out.print("Cuantos valores desea ingresar en el primer vector: ");
        int vectorATam = in.nextInt();
        int [] A;
        A = new int [vectorATam];
        System.out.print("Cuantos valores desea ingresar en el segundo vector: ");
        int vectorBTam = in.nextInt();
        int [] B;
        B = new int [vectorBTam];
        int vectorCTam = 0;
        if(vectorATam > vectorBTam){
            vectorCTam = vectorATam;
        } else{
            vectorCTam = vectorBTam;
        }
        int [] C;
        C = new int [vectorCTam];
        for(int index = 0; index < vectorCTam; vectorCTam++){
            C[index] = A[index] * B[index-1];
        }
        
        /*Ejercicio 7*/
        
        System.out.print("Cuantos valores desea ingresar: ");
        int vector7Tam = in.nextInt();
        int [] vector7;
        vector7 = new int [vector7Tam];
        for(int index1 = 0; index1 < vector7Tam; index1++){
            System.out.println("Ingrese valor: ");
            vector7[index1] = in.nextInt();
        }
        int [] vector7Aux;
        vector7Aux = new int [vector7Tam];
        for(int index1 = 0; index1 < vector7Tam; index1++){
           vector7Aux[vector7Tam-index1] = vector7[index1];
        }
        for(int index1 = 0; index1 < vector7Tam; index1++){
            System.out.println(vector7Aux[index1]);
        }
        
        /*Ejercicio 8*/
        
        System.out.print("Cuantos valores desea ingresar: ");
        int vector8Tam = in.nextInt();
        double [] vector8;
        vector8 = new double [vector8Tam];
        for(int index1 = 0; index1 < vector8Tam; index1++){
            System.out.println("Ingrese valor: ");
            vector8[index1] = in.nextDouble();
        }
        double [] vector8Aux;
        vector8Aux = new double [vector8Tam];
        for(int index1 = 0; index1 < vector8Tam; index1++){
           vector8Aux[vector8Tam] = vector8[vector8Tam] * 3.14;
        }
        for(int index1 = 0; index1 < vector8Tam; index1++){
            System.out.println(vector8Aux[index1]);
        }
        
        /*Ejercicio 9*/
        
        System.out.print("Cuantos valores desea ingresar en ambos vectores: ");
        int vector9Tam = in.nextInt();
        int [] vector91;
        vector91 = new int [vector9Tam];
        for(int index1 = 0; index1 < vector9Tam; index1++){
            System.out.println("Ingrese valor: ");
            vector91[index1] = in.nextInt();
        }
        int [] vector92;
        vector92 = new int [vector9Tam];
        for(int index1 = 0; index1 < vector9Tam; index1++){
            System.out.println("Ingrese valor: ");
            vector92[index1] = in.nextInt();
        }
        int [] productoEscalar9;
        productoEscalar9 = new int [vector9Tam];
        for(int index1 = 0; index1 < vector9Tam; index1++){
            productoEscalar9[index1] = productoEscalar9[index1 - 1] + ( vector91[index1] * vector92[index1] );
        }
        System.out.println("El producto escalar es:");
        for(int index1 = 0; index1 < vector9Tam; index1++){
            System.out.println(productoEscalar9[index1]);
        }
        
        /*Ejercicio 10*/
        
        System.out.print("Cuantos valores desea ingresar en ambos vectores: ");
        int vector10Tam = in.nextInt();
        int [] vector101;
        vector101 = new int [vector10Tam];
        for(int index1 = 0; index1 < vector10Tam; index1++){
            System.out.println("Ingrese valor: ");
            vector101[index1] = in.nextInt();
        }
        int [] vector102;
        vector102 = new int [vector10Tam];
        for(int index1 = 0; index1 < vector10Tam; index1++){
            System.out.println("Ingrese valor: ");
            vector102[index1] = in.nextInt();
        }
        int [] vector10Aux;
        vector10Aux = new int [vector10Tam];
        for(int index1 = 0; index1 < vector10Tam; index1++){
           vector10Aux[vector10Tam-index1] = vector102[index1];
        }
        int [] productoEscalar10;
        productoEscalar10 = new int [vector10Tam];
        for(int index1 = 0; index1 < vector10Tam; index1++){
            productoEscalar10[index1] = productoEscalar10[index1 - 1] + ( vector101[index1] * vector10Aux[index1] );
        }
        
        
        System.out.println("El producto escalar es:");
        for(int index1 = 0; index1 < vector10Tam; index1++){
            System.out.println(productoEscalar10[index1]);
        }
        
        /*Ejercicio 11*/
        
        System.out.print("Cuantos valores desea ingresar en ambos vectores: ");
        int vector11Tam = in.nextInt();
        int [] vector11;
        vector11 = new int [vector11Tam];
        for(int index1 = 0; index1 < vector11Tam; index1++){
            System.out.println("Ingrese valor: ");
            vector11[index1] = in.nextInt();
        }
        System.out.print("Ingrese valor a comparar: ");
        int comparador11 = in.nextInt();
        int resultado11 = GuiaDeEjercicios1.buscadorNum(vector11, comparador11);
        if ( resultado11 != 0) {
        		System.out.println("Su valor se encuentra en la posicion: " +resultado11);
        } else {
        	System.out.println("Su valor no se encuentra en el arreglo.");
        } 

    	/*Ejercicio 12*/

    	System.out.print("Cuantos valores desea ingresar en el vector: ");
        int vector12Tam = in.nextInt();
        int [] vector12;
        vector12 = new int [vector12Tam];
        for(int index1 = 0; index1 < vector12Tam; index1++){
            System.out.println("Ingrese valor: ");
            vector12[index1] = in.nextInt();
        }

        Arrays.sort(vector12);
        System.out.println("Orden Ascendente: ");
        for(int index1 = 0; index1 < vector12Tam; index1++){
            System.out.println(vector12[index]);
        }

        Arrays.sort(vector12, Collections.reverseOrder());
        System.out.println("Orden Ascendente: ");
        for(int index1 = 0; index1 < vector12Tam; index1++){
            System.out.println(vector12[index]);
        }

    }
    
    
}
