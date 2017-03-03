package com.nubeando.Tema16Estrategia;

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
public class PruebaEstrategia {

    public static void main(String[] args) {
        AvionComercial avionComercial = new AvionComercial();
        AvionRapido avionRapido = new AvionRapido();

        System.out.println("Primero el avion comercial...");
        avionComercial.setAlgoritmo(new EnTierra());
        avionComercial.mover();
        avionComercial.setAlgoritmo(new EnAire());
        avionComercial.mover();
        System.out.println();

        System.out.println("Ahora el avion rapido...");
        avionRapido.setAlgoritmo(new EnTierra());
        avionRapido.mover();
        avionRapido.setAlgoritmo(new EnAireVeloz());
        avionRapido.mover();
        System.out.println();

        System.out.println("El avion comercial veloz...");
        avionComercial.setAlgoritmo(new EnAireVeloz());
        avionComercial.mover();
    }
}
