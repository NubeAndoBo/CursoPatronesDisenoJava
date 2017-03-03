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
public interface I_ImplLista {

    public void addItem(String item);

    public void remItem(String item);

    public int getCantidadDeItems();

    public String getItem(int index);

    public boolean soportaRepetidos();
}
