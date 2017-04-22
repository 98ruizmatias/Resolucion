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
//
//    public static int minimo(int [] array1){
//        int aux = array1[0];
//        for(int index = 0; index < array1.length; index++){
//            if(array1[index] == aux){
//                aux = array1[index];
//            }
//        }
//        return aux;
//    }
//
//    /*Ejercicio 3*/
//
//    public static boolean positivos(int [] arreglo){
//        boolean limbo = true;
//        for(int index = 0 ; index < arreglo.length; index++)
//        {
//            if(arreglo[index] < 0) {
//                limbo = false;
//            }
//        }
//        return limbo;
//    }
//
//    /*Ejercicio 4*/
//
//    public static int calculoBoleanos(boolean [] arrayBoole){
//        int contadorPar = 0;
//        int contadorInpar = 0;
//        for(int index = 0; index < arrayBoole.length; index++){
//
//            if( (index % 2) == 0 || arrayBoole[index] == true){
//                contadorPar++;
//            } else if( (index % 2) != 0 || arrayBoole[index] == false) {
//                contadorInpar++;
//            }
//        }
//        return contadorPar * contadorInpar;
//    }
//
//    /*Ejercicio 5*/
//
//    public static int[] mixedArrays(int [] arreglo1, int [] arreglo2){
//        int leng;
//        if (arreglo1.length > arreglo2.length){
//            leng = arreglo1.length;
//        } else{
//            leng = arreglo2.length;
//        }
//
//        int [] aux;
//        aux = new int[leng];
//        for(int index = 0; index < arreglo1.length; index++){
//            if( index%2 != 0 ){
//                aux[index] = arreglo1[index];
//            }
//        }
//        for(int index = 0; index < arreglo2.length; index++){
//            if( index%2 == 0 ){
//                aux[index] = arreglo2[index];
//            }
//        }
//        return aux;
//    }
//
//    /*Ejercicio 6*/
//
//    /*Ejercicio 7*/
//
//    /*Ejercicio 8*/
//
//    /*Ejercicio 9*/
//
//    /*Ejercicio 10*/
//
//    /*Ejercicio 11*/
//
//    public static int buscadorNum(int [] array11, int num){
//        int resultado = 0;
//        for(int index = 0; index < array11.length; index++ ){
//            if(array11[index] == num){
//                resultado = index;
//            }
//        }
//        return resultado;
//    }
//
//    /*Ejercicio 12*/
//
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