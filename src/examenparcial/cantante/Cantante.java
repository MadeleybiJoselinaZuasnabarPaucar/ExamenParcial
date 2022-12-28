package examenparcial.cantante;
    public class Cantante {
     private String nombre;
     
    public Cantante() {
    }
    
     public Cantante(String nombre) {
        this.nombre = nombre;
    }
     
     public String getNombre() {
        return nombre;
    }
     
     public void setNombre(String nombre) {
        this.nombre = nombre;
    }  
 
    public String devolverCantante(){
    return "Nombre: " + nombre;
    }

    static class java {

        public java() {
        }
    }
}