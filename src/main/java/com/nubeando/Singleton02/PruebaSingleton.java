package com.nubeando.Singleton02;

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
public class PruebaSingleton {

    public static void main(String... args) {
        Singleton miSingleton = Singleton.obtenerSingleton();
        Singleton miSingletonDos = Singleton.obtenerSingleton();
        Singleton miSingletonTres = Singleton.obtenerSingleton();
        Singleton miSingletonCuatro = Singleton.obtenerSingleton();
        Singleton miSingletonCinco = Singleton.obtenerSingleton();
        Singleton miSingletonSeis = Singleton.obtenerSingleton();
        Singleton miSingletonSiete = Singleton.obtenerSingleton();
        Singleton miSingletonOcho = Singleton.obtenerSingleton();
        Singleton miSingletonNueve = Singleton.obtenerSingleton();

        miSingletonSeis.vecesLlamado();
        System.out.println("He terminado de crear los objetos");
    }
}
