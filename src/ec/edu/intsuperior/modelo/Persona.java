
package ec.edu.intsuperior.modelo;


public class Persona {
    String nombre;
    private int edad;
    
    public Persona(){
        
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void setNombre(String nombre) {
      this.nombre=nombre;  
        
    } 
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
      @Override //sobreescribir
    public String toString() {
        return "Nombre: "+ getNombre()+"\n"
                + "Edad: "+ getEdad();  
    }
}
