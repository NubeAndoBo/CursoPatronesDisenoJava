package com.nubeando.Cadena14;

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

public class PruebaCadena {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        Aplicacion aplicacion = new Aplicacion();
        Middle intermediario = new Middle(aplicacion);
        FrontEnd presentacion = new FrontEnd(intermediario);

        do {
            System.out.println("**************************************");
            System.out.println("* SELECCIONE LA AYUDA QUE DESEA VER  *");
            System.out.println("* 1 = Presentacion                   *");
            System.out.println("* 2 = Logica                         *");
            System.out.println("* 3 = Aplicacion                     *");
            System.out.println("* 0 = Salir del programa de ayuda    *");
            System.out.println("**************************************");

            opcion = sc.nextInt();
            if (opcion != 0) {
                presentacion.getAyuda(opcion);
            }
        } while (opcion != 0);
    }
}
