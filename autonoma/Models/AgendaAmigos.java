/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Usuario
 */
public class AgendaAmigos {
    
    private final List<Amigos> amigos = new ArrayList<>();

    public void agregarAmigos(Amigos amigo) {
        for (Amigos a : amigos) {
            if (a.getCorreo().toLowerCase().equals(amigo.getCorreo().toLowerCase())) {
                System.out.println("El amigo con correo " + amigo.getCorreo() + " ya está registrado.");
                return;
            }
        }
        amigos.add(amigo);
        System.out.println("Amigo agregado.");
    }

    public Amigos buscarAmigos(String email) {
        for (Amigos a : amigos) {
            if (a.getCorreo().toLowerCase().equals(email.toLowerCase())) {
                return a;
            }
        }
        System.out.println("No se encontró un amigo con el correo: " + email);
        return null;
    }
}