package com.nubeando.Tema11Compuesto;

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
public class Entregable implements ItemProyecto {

    private String nombre;

    public Entregable(String n) {
        this.nombre = n;
    }

    @Override
    public int getTiempo() {
        return 0;
    }

    @Override
    public void imprimir() {
        System.out.println("\tEntregable: " + this.nombre);
    }
}
