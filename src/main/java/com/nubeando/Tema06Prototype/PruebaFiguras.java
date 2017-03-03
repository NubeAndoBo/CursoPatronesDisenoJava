package com.nubeando.Tema06Prototype;

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

public class PruebaFiguras {

    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);
        int opcion, posX, posY;

        Circulo circulo = new Circulo();
        Cuadrado cuadrado = new Cuadrado();
        Figura figura;

        circulo.setNombre("Mi circulo");
        circulo.mover(12, 34);

        cuadrado.setNombre("Mi cuadrado");
        cuadrado.mover(200, 200);

        System.out.println("Estas son las figuras originales:");
        System.out.println("Circulo: " + circulo.getNombre());
        System.out.println("Cuadrado: " + cuadrado.getNombre());
        System.out.println("Estas son las posiciones originales:");
        circulo.getPosicion();
        cuadrado.getPosicion();

        System.out.println("Digite la opcion que desea clonar:");
        System.out.println("1 = Circulo, 2 = Cuadrado");
        opcion = sc.nextInt();

        if (opcion == 1) {
            figura = circulo.clonar();
        } else {
            figura = cuadrado.clonar();
        }

        figura.setNombre(figura.getNombre() + " clonado");
        System.out.print("Digite la nueva posicion en X: ");
        posX = sc.nextInt();
        System.out.print("Digite la nueva posicion en Y: ");
        posY = sc.nextInt();
        figura.mover(posX, posY);

        System.out.println("Esta es figura clonada:");
        System.out.println(figura.getNombre());
        System.out.println("Esta es la posicion del clon:");
        figura.getPosicion();

        System.out.println("Estas son las figuras originales:");
        System.out.println("Circulo: " + circulo.getNombre());
        System.out.println("Cuadrado: " + cuadrado.getNombre());
        System.out.println("Estas son las posiciones originales:");
        circulo.getPosicion();
        cuadrado.getPosicion();

    }
}
