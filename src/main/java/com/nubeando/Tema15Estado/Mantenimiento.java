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
public class Mantenimiento implements Estado {

    @Override
    public void ejecutarAccion() {
        System.out.println("Estado en mantenimiento: No atento");
        System.out.println("Enviar correo para informar el estado");
    }
}
