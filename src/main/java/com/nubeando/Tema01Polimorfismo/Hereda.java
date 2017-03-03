package com.nubeando.Tema01Polimorfismo;

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
public class Hereda implements Interface {

    public Hereda() {
        saludar();
    }

    @Override
    public String getNombre() {
        return miNombre;
    }

    @Override
    public void saludar() {
        System.out.println("Hola " + getNombre());
    }

    public static void main(String... args) {
        Hereda hereda = new Hereda();
    }
}
