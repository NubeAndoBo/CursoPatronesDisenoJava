package com.nubeando.Prototype06;

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
public class PruebaReferencias {

    public static void main(String... args) {

        Persona uno = new Persona("Alexys");
        System.out.print("El nombre del objeto uno es: ");
        System.out.println(uno.getNombre());

        Persona dos = new Persona("");
        dos = uno;
        System.out.print("El nombre del objeto dos es: ");
        System.out.println(dos.getNombre());

        dos.setNombre("Ronald");
        System.out.print("El nombre del objeto uno es: ");
        System.out.println(uno.getNombre());

    }
}
