package ordenacion;

public class TestMetodos {

    public static void main(String[] args) {
     MetodosDeOrdenamiento ordena = new MetodosDeOrdenamiento();
       int [] arreglo = {4, 3, 7, -125, 265 , 7864, 215, -1256};
       ordena.ordenamientoporSeleccion(arreglo);
       ordena.imprime(arreglo);
    }

}
