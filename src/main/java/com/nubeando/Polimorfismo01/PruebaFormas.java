package com.nubeando.Polimorfismo01;

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
public class PruebaFormas {

    public static void main(String... args) {
        Forma miForma = new Rectangulo();
        miForma.dibujar();
        miForma.redimensionar();
    }
}
