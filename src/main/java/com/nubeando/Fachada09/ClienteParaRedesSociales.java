package com.nubeando.Fachada09;

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
public class ClienteParaRedesSociales {

    private Fachada miFachada;

    public ClienteParaRedesSociales() {
        miFachada = new Fachada();
    }

    public void encenderCPU() {
        miFachada.encenderCPU();
        System.out.println("ENTRO A LAS REDES SOCIALES");
    }

    public static void main(String args[]) {
        ClienteParaRedesSociales cprs = new ClienteParaRedesSociales();
        cprs.encenderCPU();
    }

}
