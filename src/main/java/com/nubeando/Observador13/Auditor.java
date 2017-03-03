package com.nubeando.Observador13;

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
public class Auditor implements Observador {

    @Override
    public void actualizar(String a, String l) {
        System.out.println("Guardando en la BD, Accion: " + a + ", Lugar: " + l);
    }
}
