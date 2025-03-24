/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class AplicacionApp {
    private final AgendaAmigos agenda = new AgendaAmigos();

    public String agregarAmigo(String nombre, String telefono, String email) {
        if (nombre.isEmpty() || telefono.isEmpty() || email.isEmpty()) {
            return "Todos los campos son obligatorios.";
        }
        return agenda.agregarAmigo(new Amigos(nombre, telefono, email));
    }

    public Amigos buscarAmigos(String email) {
        return agenda.buscarAmigos(email);
    }

    public String mostrarAcercaDe() {
        return "Aplicación: Agenda de Amigos\nclase: Programación\nuniversidad: UAM\nDesarrolladores: Equipo de Desarrollo";
    }
}
    
