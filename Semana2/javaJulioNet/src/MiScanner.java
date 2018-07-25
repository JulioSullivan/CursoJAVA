/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cur01alu32
 */
import java.io.IOException;

public class MiScanner {
    public static void main(String[] args) {
        try {
            byte[] buffer = new byte[1024]; //Es un flujo de bytes
            System.out.println("Ingresa un caracter");
            System.in.read(buffer); //Este lo que hace es recibir los datos como codigo ascii y los guarda en nuestro buffer.
            System.out.print("Has ingresado: \"");
            for (int i = 0; i < buffer.length; i++) {
                System.out.print((char)buffer[i]);
            }
            System.out.println("\"");
        } catch (IOException ex) {
            System.out.println("Hubo un error.");
        }
        //No es necesariio cerrar el flujo porque es el teclado.
    }
}
