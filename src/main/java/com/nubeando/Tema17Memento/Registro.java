package com.nubeando.Tema17Memento;

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
public class Registro {

    private String nombre;
    private int edad;
    private boolean esActivo;

    public Registro(String n, int e, boolean a) {
        this.nombre = n;
        this.edad = e;
        this.esActivo = a;
    }

    public void getRegistro() {
        System.out.print("Nombre: " + this.nombre + ", ");
        System.out.print("Edad: " + this.edad + ", ");
        System.out.print("Activo: " + this.esActivo + ".\n");
    }
}
