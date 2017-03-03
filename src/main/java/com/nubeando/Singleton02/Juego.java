package com.nubeando.Singleton02;

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

public class Juego {

    public static void main(String... args) {
        Marcianos marcianos;
        Computadora computadora;
        Jugador jugador;
        Scanner sc;
        marcianos = Marcianos.getMarcianos();
        computadora = new Computadora();
        jugador = new Jugador();
        sc = new Scanner(System.in);

        int disparos;

        do {
            System.out.print("Digite los disparos: ");
            disparos = sc.nextInt();
            for (int i = 0; i < disparos; i++) {
                jugador.destruirMarciano();
            }
            computadora.creaMarcianos();
            marcianos.cuantosQuedan();
        } while (disparos != 0);

    }
}
