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
public class Computadora {

    private Marcianos marcianos;

    public Computadora() {
        marcianos = Marcianos.getMarcianos();
    }

    public void creaMarcianos() {
        marcianos.creaMarcianos();
    }
}
