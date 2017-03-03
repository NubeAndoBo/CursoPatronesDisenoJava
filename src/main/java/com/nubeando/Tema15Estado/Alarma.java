package com.nubeando.Tema15Estado;

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
public class Alarma {

    private Estado miEstado;

    public void setEstado(Estado e) {
        this.miEstado = e;
    }

    public void ejecutarAccion() {
        miEstado.ejecutarAccion();
    }
}
