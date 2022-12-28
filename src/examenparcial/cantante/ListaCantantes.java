package examenparcial.cantante;
import java.util.ArrayList;
import examenparcial.cantante.Cantante.java;

public class ListaCantantes {
    private final ArrayList<Cantante> cantantes = new ArrayList();

    public void ListaCantantes() {
    }
 
    public void anadirCantante(String nombre) {
        cantantes.add(new Cantante(nombre));
    }

    public ArrayList<Cantante> obtenerListadoFormateado() {
        for (int x = 0; x < cantantes.size(); x++) {
            System.out.println("Cantante: " + cantantes.get(x).getNombre());
        }
        return cantantes;
    }

    public ArrayList<Cantante> listadoCantantes() {
        for (int x = 0; x < cantantes.size(); x++) {
            System.out.println(cantantes.get(x).getNombre());
        }
        return cantantes;
    }
}