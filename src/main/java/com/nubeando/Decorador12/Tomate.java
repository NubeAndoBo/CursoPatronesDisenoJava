package com.nubeando.Decorador12;

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
public class Tomate extends DecoradorHamburguesa {

    private Hamburguesa hamburguesa;

    public Tomate(Hamburguesa h) {
        this.hamburguesa = h;
    }

    @Override
    public String getDescripcion() {
        return hamburguesa.getDescripcion() + " + Tomate";
    }
}
