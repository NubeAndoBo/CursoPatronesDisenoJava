package com.nubeando.Tema06Prototype;

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
public interface Figura {

    public void setNombre(String n);

    public String getNombre();

    public void mover(int x, int y);

    public void getPosicion();

    public Figura clonar();
}
