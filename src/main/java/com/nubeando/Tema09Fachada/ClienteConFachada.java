package com.nubeando.Tema09Fachada;

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
public class ClienteConFachada {

    private Fachada miFachada;

    public ClienteConFachada() {
        miFachada = new Fachada();
    }

    public void encenderCPU() {
        miFachada.encenderCPU();
        System.out.println("COMIENZO A TRABAJAR");
    }

    public static void main(String args[]) {
        ClienteConFachada ccf = new ClienteConFachada();
        ccf.encenderCPU();
    }
}
