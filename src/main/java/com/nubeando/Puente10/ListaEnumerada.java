package com.nubeando.Puente10;

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
public class ListaEnumerada extends ListasBase {

    @Override
    public String obtenerItem(int index) {
        return (index + 1) + ". " + super.obtenerItem(index);
    }
}
