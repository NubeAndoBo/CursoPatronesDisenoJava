package com.nubeando.Tema12Decorador;

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
public class Queso extends DecoradorHamburguesa {

    private Hamburguesa hamburguesa;

    public Queso(Hamburguesa h) {
        this.hamburguesa = h;
    }

    @Override
    public String getDescripcion() {
        return hamburguesa.getDescripcion() + " + Queso";
    }
}
