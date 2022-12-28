package ordenacion;

import java.util.Arrays;
public class Intercambio {

    public static void main(String[] args) {
       int[] a = {26,98,32,14,2};
       int i, j;
       for(i=0; i<a.length -1; i++) {
        for(j=i; j<a.length; j++){
            if(a[i]>a[j]){
            intercambio(a,i,j);
            }
        }
    }   
       System.out.println(Arrays.toString(a));
    }
    private static void intercambio(int[] a, int i, int j){
        int aux = a[i];
        a[i] = a[j];
        a[j] = aux;
}
}
