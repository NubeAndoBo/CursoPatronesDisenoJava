package com.nubeando.Tema14Cadena;

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
public class Middle implements InterfaceAyuda {

    private final int TIPO_AYUDA = 2;
    private InterfaceAyuda susesor;

    public Middle(InterfaceAyuda s) {
        this.susesor = s;
    }

    @Override
    public void getAyuda(int tipo) {
        if (tipo == TIPO_AYUDA) {
            System.out.println("\t++ Ayuda desde el Middle.");
        } else {
            susesor.getAyuda(tipo);
        }
    }
}
