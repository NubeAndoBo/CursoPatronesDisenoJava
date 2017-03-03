package com.nubeando.Tema02Singleton;

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
public final class Singleton {

    private static final Singleton singleton = new Singleton();
    private static int cantidad;

    private Singleton() {
        System.out.println("Hola, he sido creado una sola vez!!!");
    }

    public static Singleton obtenerSingleton() {
        cantidad++;
        return singleton;
    }

    public static void vecesLlamado() {
        System.out.println("Se ha llamado el metodo: " + cantidad + " veces");
    }

}
