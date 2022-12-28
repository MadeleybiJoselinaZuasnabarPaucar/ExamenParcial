package examenparcial.cantante;
public class Principal {
    
public static void main(String[] args) {
  
        ListaCantantes cantantes = new ListaCantantes();
       
        cantantes.anadirCantante("Freddie Mercury");
        cantantes.anadirCantante("Zaz");
        cantantes.anadirCantante("Stromae");
        cantantes.anadirCantante("Noa");
        cantantes.anadirCantante("Enrique Bunbury");
        cantantes.anadirCantante("Edith Piaf");
        cantantes.anadirCantante("Otis Redding");
        cantantes.anadirCantante("Antonio Machín");
     
        cantantes.listadoCantantes();
         
        cantantes.obtenerListadoFormateado();
       }
}