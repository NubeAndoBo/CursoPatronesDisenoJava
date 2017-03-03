package com.nubeando.Estrategia16;

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
public abstract class Avion {

    private Algoritmo miAlgoritmo;

    public void setAlgoritmo(Algoritmo a) {
        this.miAlgoritmo = a;
    }

    public void mover() {
        this.miAlgoritmo.moverse();
    }
}
