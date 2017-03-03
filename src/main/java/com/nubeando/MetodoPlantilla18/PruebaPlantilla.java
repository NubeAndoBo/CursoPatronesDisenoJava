package com.nubeando.MetodoPlantilla18;

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
public class PruebaPlantilla {

    public static void main(String... args) {

        CajeroAutomatico ca = new CajeroAutomatico("F678AB", 30, 1);
        ca.procesar("F678AB", 10, 2);

        System.out.println();

        Cajero c = new Cajero("1234AB", 50, 1);
        c.procesar("1234AB", 10, 2);
    }
}
