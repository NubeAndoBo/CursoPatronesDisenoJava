package com.nubeando.Memento17;

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

public class PruebaMemento {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        BaseDeDatos bd = new BaseDeDatos();

        bd.agregarRegistro("Alexys Lozada", 33, true);
        bd.agregarRegistro("Ronald Lozada", 32, true);
        bd.generarBackup();

        bd.agregarRegistro("Carol Lozada", 18, true);
        bd.agregarRegistro("Leidy Gonzalez", 10, true);
        bd.generarBackup();

        bd.agregarRegistro("Yamile Gamboa", 33, false);
        bd.agregarRegistro("Jennifer Piedrahita", 27, false);
        bd.generarBackup();

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    bd.mostrarListado();
                    break;
                case 2:
                    bd.limpiarBD();
                    System.out.println("Base de datos borrada.");
                    break;
                case 3:
                    muestraBackup(bd.getTamanioBackup());
                    bd.getBackup(sc.nextInt() - 1);
                    break;
                default:
                    System.out.println("No ha digitado una opcion valida");
            }
        } while (opcion != 0);
    }

    public static void mostrarMenu() {
        System.out.println("*********************************************");
        System.out.println("* SELECCIONE LA OPCION DE LA BD             *");
        System.out.println("* 1- Listar 2- LimpiarBD 3- Restaura Backup *");
        System.out.println("*********************************************");
    }

    public static void muestraBackup(int t) {
        System.out.format("Existen %s backups.", t);
        System.out.print("\nDigite el backup que desea restaurar: ");
    }
}
