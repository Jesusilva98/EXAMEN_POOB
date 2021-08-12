
package ec.edu.intsuperior.modelo;


 

public class Cliente {
    private String telefono;

    public Cliente() {
    }

    public Cliente(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    @Override //sobreescribir
    public String toString() {
        return "Nombre: "+ getTelefono();
    }
    
}
