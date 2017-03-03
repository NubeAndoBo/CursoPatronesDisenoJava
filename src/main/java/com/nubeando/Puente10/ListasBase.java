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
public class ListasBase {

    protected I_ImplLista implementacion;

    public void setImplementacion(I_ImplLista impl) {
        this.implementacion = impl;
    }

    public void agregarItem(String item) {
        implementacion.addItem(item);
    }

    public void removerItem(String item) {
        implementacion.remItem(item);
    }

    public int cuentaItems() {
        return implementacion.getCantidadDeItems();
    }

    public String obtenerItem(int index) {
        return implementacion.getItem(index);
    }

}
