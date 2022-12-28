
package ordenacion;

import java.util.Scanner;

public class Shell {

    public static void main(String[] args) {
       Scanner valor = new Scanner (System.in);
       System.out.println("Ingrese el Numero de elementos: ");
       int p = valor.nextInt();
       int[] a = new int[p];
       System.out.println("Ingrese los valores del arreglo: ");
       for (int i=0; i<p; i++){
           a[i] = valor.nextInt();
       }
       System.out.println("-----------SALIDA DE DATOS-------------");
       for (int i = 0; i < p; i++){
           System.out.println(+a[i]);
       }
    }


    }
