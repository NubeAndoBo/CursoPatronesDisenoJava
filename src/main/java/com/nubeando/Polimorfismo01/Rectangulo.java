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
public class Rectangulo extends Forma {

    public Rectangulo() {
        mover(5, 8);
        dondeEstoy();
    }

    @Override
    public void dibujar() {
        System.out.println("Estoy dibujando un Rectangulo");
    }

    @Override
    public void redimensionar() {
        System.out.println("Estoy siendo mas grande");
    }

}
