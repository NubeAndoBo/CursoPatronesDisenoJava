package com.nubeando.Tema18MetodoPlantilla;

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
public class Cajero extends CuentaBancaria {

    public Cajero(String c, int i, int t) {
        procesar(c, i, t);
    }

    @Override
    public void auditoria() {
        super.auditoria();
        System.out.println("Con mucho gusto, vuelva pronto.");
    }

    @Override
    public void saludar() {
        System.out.println("Bienvenido a su banco, en que le puedo ayudar?");
    }
}
