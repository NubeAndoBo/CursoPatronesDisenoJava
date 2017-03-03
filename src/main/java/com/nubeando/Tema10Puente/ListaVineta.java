package com.nubeando.Tema10Puente;

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
public class ListaVineta extends ListasBase {

    private char tipoVineta;

    public void setTipoItem(char nuevoTipo) {
        if (nuevoTipo > ' ') {
            tipoVineta = nuevoTipo;
        } else {
            tipoVineta = '+';
        }
    }

    @Override
    public String obtenerItem(int index) {
        return tipoVineta + " " + super.obtenerItem(index);
    }

}
