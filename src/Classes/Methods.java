package Classes;

public class Methods{
    /*Ejercicio 1*/

    public static int posicionDelMenorValorDelArray(int [] array1){
        int aux = array1[0];
        int pos = 0;
        for(int index = 0; index < array1.length; index++){
            if (array1[index] < aux) {
                aux = array1[index];
                pos = index;
            }
        }
        return (pos+1);
    }

    /*Ejercicio 2*/

    public static int posicionDelMaximoValorDelArray(int [] array1){
        int aux = array1[0];
        int pos = 0;
        for(int index = 0; index < array1.length; index++){
            if (array1[index] > aux) {
                aux = array1[index];
                pos = index;
            }
        }
        return (pos+1);
    }

    /*Ejercicio 3*/

    public static boolean retornoDeArrayPositivosBoolean(int [] arreglo){
        boolean trigger = true;
        for(int index = 0 ; index < arreglo.length; index++)
        {
            if(arreglo[index] < 0) {
                trigger = false;
            }
        }
        return trigger;
    }

    /*Ejercicio 4*/

    public static int calculoBoleanosParPorInpar(boolean [] arrayBoole){
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

    public static int[] multiplicacionParAttay1porImparArray2(int [] arreglo1, int [] arreglo2){
        int []aux = new int[arreglo1.length];
        for (int index = 0; index < aux.length; index++ ){
            if (index%2 == 0){
                aux[index] = arreglo1[index];
            }
            else {
                aux[index] = arreglo2[index];
            }
        }
        return aux;
    }

    /*Ejercicio 6*/

    public static int[] aPorBIgualC(int [] A, int [] B){
        int [] C = new int[A.length];
        for (int index = 0; index < C.length; index++){
            C[index] = A[index] * B[C.length-index];
        }
        return C;
    }

    /*Ejercicio 7*/

    public static int[] invertirArray(int [] array){
        int [] invertido = new int[array.length];
        for (int index = 0; index < array.length; index++){
            invertido[index] = array[array.length-1-index];
        }
        return invertido;
    }

    /*Ejercicio 8*/

    public static double[] arrayEscalarDePi(int [] array){
        double [] escalar = new double[array.length];
        for (int index = 0; index < array.length; index++){
            escalar[index] = array[index] * 3.14;
        }
        return escalar;
    }

    /*Ejercicio 9*/

    public static int productoEscalarDeDosArrays(int [] A, int [] B){
        int C = 0;
        for (int index = 0; index < A.length; index++){
            C = C + (A[index] * B[index]);
        }
        return C;
    }

    /*Ejercicio 10*/

    public static int productoEscalarDeArrayPorSiMismo(int [] A){
        int C = 0;
        for (int index = 0; index < A.length; index++){
            C = C + (A[index] * A[A.length - index]);
        }
        return C;
    }

    /*Ejercicio 11*/

    public static int buscadorDeNumeroEnArray(int [] array11, int num){
        int resultado = -1;
        for(int index = 0; index < array11.length; index++ ){
            if(array11[index] == num){
                resultado = index;
            }
        }
        return resultado;
    }

    /*Ejercicio 12*/

    public static int[] ordenDeArrayAscendente(int [] array){
        int aux;
        for(int i=0;i<array.length;i++){
            for(int j=(i+1);j<array.length;j++){
                if (array[i]>array[j]){
                    aux = array[i];
                    array[i]=array[j];
                    array[j]=aux;
                }
            }
        }
        return array;
    }

    public static int[] ordenDeArrayDescendente(int [] array){
        int aux;
        for(int i=0;i<array.length;i++){
            for(int j=(i+1);j<array.length;j++){
                if (array[i]<array[j]){
                    aux = array[j];
                    array[j]=array[i];
                    array[i]= aux;
                }
            }
        }
        return array;
    }

//    /*Ejercicio 13*/
//
//    public static boolean buscadorEficiente(int [] array, int num){
//        Arrays.sort(array);
//        int arryMitad = array.length/2;
//        if ( num >= array[arryMitad] ) {
//            for (int index = arryMitad; index < array.length; index++ ) {
//                if(num == array[index]){
//                    return true;
//                }
//            }
//        }else if(num >= array[arryMitad]){
//            for (int index = 0; index < arryMitad; index++ ) {
//                if(num == array[index]){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    /*Ejercicio 14*/
//
//    public static int[] duplicador(int [] array){
//        int [] duplicado;
//        duplicado = new int [array.length*2];
//        for(int index = 0; index < duplicado.length; index++){
//            if (index < array.length){
//                array[index] = duplicado [index];
//            } else {
//                duplicado[index] = 10;
//            }
//        }
//        return duplicado;
//    }
//
//    /*Ejercicio 15*/
//
//    public static int[] agregador(int [] array, int nuevo){
//        Arrays.sort(array);
//        int aux = 0;
//        for (int index = 0; index < array.length ; index++ ) {
//            if (nuevo > array[index] && nuevo < array[index+1]) {
//                aux = index;
//                for (int indexB = array.length-1; indexB > aux ; indexB-- ) {
//                    array[indexB] = array[indexB-1];
//                }
//                array[index] = nuevo;
//            } else if ( nuevo = array[index]) {
//                aux = index
//                for (int indexB = array.length-1; indexB > aux ; indexB-- ) {
//                    array[indexB] = array[indexB-1];
//                }
//                array[index] = nuevo;
//            }
//        }
//    }
//
//    /*Ejercicio 16*/
//
//    public static boolean estrictamenteCreciente(int [] array){
//        boolean returner;
//        for (int index = 0; index < array.length ; index++) {
//            if (array[index] > array[index-1]) {
//                returner == true;
//            } else {
//                returner == false;
//            }
//        }
////        return returner;
//    }

}