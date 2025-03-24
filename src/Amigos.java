/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Amigos {

// Clase Amigo simplificada
    private final String nombre;
    private final String telefono;
    private final String email;

    public Amigos(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nTeléfono: " + telefono + "\nCorreo: " + email;
    }
}
    

