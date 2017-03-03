package com.nubeando.Tema08Adaptador;

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
import java.util.Scanner;

public class PruebaNombre {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        Nombre objetoNombre = new Nombre();

        System.out.println();
        System.out.println();
        System.out.print("Digite su nombre y apellido: ");
        objetoNombre.setNombreCompuesto(sc.nextLine());

        System.out.println();
        System.out.println();
        System.out.println("Tu nombre completo es: "
                + objetoNombre.getNombreCompuesto()
        );
    }
}
