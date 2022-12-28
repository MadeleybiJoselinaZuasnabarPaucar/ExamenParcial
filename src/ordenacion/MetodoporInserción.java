package ordenacion;
import java.util.Random;
public class MetodoporInserción {

    public static void main(String[] args) {
   Random rdm = new Random ();
   int num [] = new int[10];

   for (int i =0; i<num.length; i++){
       num[i]=rdm.nextInt(100);
   }
   System.out.println("Los numeros generados son: ");
   for (int i=0; i<num.length; i++){
       System.out.printf("%d ", num[i]);
   }
   int pos, aux;
   for(int i =0; i<num.length; i++){
       pos=i;
       aux=num[i];
       while((pos>0)&& (num[pos -1]>aux)){
           num[pos]=num[pos -1];
           pos --;
       }
       num[pos]=aux; 
   }
     System.out.println(" ");
   System.out.println("Orden ascendente");
   for (int i =0; i<num.length; i++){
       System.out.printf("%d ", num[i]);
   }
   System.out.println(" ");

   System.out.println("Orden decendente");
   for (int i=(num.length -1); i>0; i--){
        System.out.printf("%d ",num[i]);
    }
      System.out.println(" ");

    }

}