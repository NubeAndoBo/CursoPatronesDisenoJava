package com.nubeando.Cadena14;

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
public class Aplicacion implements InterfaceAyuda {

    private final int TIPO_AYUDA = 3;

    public Aplicacion() {
    }

    @Override
    public void getAyuda(int tipo) {
        System.out.println("\t-- Ayuda BASE DE LA APLICACION.");
    }
}
