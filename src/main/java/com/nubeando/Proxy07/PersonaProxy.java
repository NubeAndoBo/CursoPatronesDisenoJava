package com.nubeando.Proxy07;

/**
 *
 * NubeAndo.COM - Educar es Compartir
 *
 * @author: Angel Céspedes Quiroz
 * @Usuario: acq1305
 * @Web: https://www.nubeando.com
 * @Facebook: https://www.facebook.com/acq1305
 * @Skype: acq1305
 * @Linkedin: https://bo.linkedin.com/in/acq1305
 *
 */
import java.io.*;
import java.net.*;

public class PersonaProxy implements Runnable {

    private Thread thread;
    Socket socket;
    InputStream in;
    PrintWriter salida;
    int character;

    public PersonaProxy() {
        try {
            socket = new Socket("127.0.0.1", 45454);
            System.out.println("Conectando....");
            in = socket.getInputStream();
            salida = new PrintWriter(socket.getOutputStream(), true);
            thread = new Thread(this);
            thread.start();
        } catch (IOException ioe) {
            System.err.println("Error al conectarse: " + ioe.getMessage());
        } catch (Exception e) {
            System.err.println("Error general: " + e.getMessage());
        }

        if (socket != null && socket.isConnected()) {
            System.out.println("Conectado!!!");
        }
    }

    @Override
    public void run() {
        try {
            while ((character = in.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void saludar() {
        salida.println("saludar");
    }

    public void decirEstado() {
        salida.println("decirEstado");
    }

    public void despedirse() {
        salida.println("despedirse");
    }
}
