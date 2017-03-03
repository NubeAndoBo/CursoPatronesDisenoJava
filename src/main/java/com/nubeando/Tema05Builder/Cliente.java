package com.nubeando.Tema05Builder;
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

public class Cliente {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        Builder constructor = new Builder();
        Robot robot;
        int tipoRobot;

        System.out.print("Digite el tipo de robot que desea: ");
        tipoRobot = sc.nextInt();

        constructor.setRobot(tipoRobot);
        constructor.addRevisar();
        constructor.addImposible();
        constructor.addGetIngredientes();
        constructor.addArmar();
        constructor.addRevisar();

        robot = constructor.getRobot();
        robot.trabajar();
    }
}
