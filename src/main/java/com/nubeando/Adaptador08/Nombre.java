package com.nubeando.Adaptador08;

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
public class Nombre implements INombre {

    private String nombreCompleto;

    public Nombre() {
    }

    public void setNombreCompuesto(String n) {
        this.nombreCompleto = n;
    }

    public String getNombreCompuesto() {
        return this.nombreCompleto;
    }
}
