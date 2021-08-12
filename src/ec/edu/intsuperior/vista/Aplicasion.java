/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.Persona;

/**
 *
 * @author Usuario
 */
public class Aplicasion {
    public static void main(String[] args) {
        Cliente c11 = new Cliente();
        
        Persona p1 = new Persona();
        
        c11.setTelefono("0997730054");
        p1.setNombre("Jesus");
        p1.setEdad(22);
        System.out.println("p1.toString()");
        System.out.println("c11.tostring()");
        
        
        
        
    }
    
}
