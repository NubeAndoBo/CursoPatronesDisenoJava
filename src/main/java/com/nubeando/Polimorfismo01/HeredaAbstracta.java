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
public class HeredaAbstracta extends ClaseAbstracta {

    @Override
    public void despedirse() {
        System.out.println("Ciao " + super.nombre);
    }

    public HeredaAbstracta() {
        darNombre("Alexys");
        saludar();
        despedirse();
    }

    public void darNombre(String nombre) {
        super.nombre = nombre;
    }

    public static void main(String... args) {
        HeredaAbstracta ha = new HeredaAbstracta();
    }
}
