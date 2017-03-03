package com.nubeando.Polimorfismo01;

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

public abstract class Forma {

    protected int posicionX;
    protected int posicionY;

    protected void mover(int nuevoX, int nuevoY) {
        posicionX = nuevoX;
        posicionY = nuevoY;
    }

    protected void dondeEstoy() {
        String lugar = "Estoy en X: " + posicionX
                + " en Y: " + posicionY;
        System.out.println(lugar);
    }

    protected abstract void dibujar();

    protected abstract void redimensionar();
}
