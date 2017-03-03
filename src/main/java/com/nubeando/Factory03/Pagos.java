package com.nubeando.Factory03;

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

public class Pagos {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        FabricaHeredada miFabrica;
        Conexion miConexion;

        System.out.print("Digite la BD: ");
        String tipo = sc.nextLine();

        miFabrica = new FabricaHeredada();
        miConexion = miFabrica.creaConexion(tipo);

        String salida = "Esta conectado con: "
                + miConexion.descripcion();

        System.out.println(salida);
    }
}
