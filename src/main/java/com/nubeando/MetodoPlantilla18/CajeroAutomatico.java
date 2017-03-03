package com.nubeando.MetodoPlantilla18;

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
public class CajeroAutomatico extends CuentaBancaria {

    public CajeroAutomatico(String c, int i, int t) {
        procesar(c, i, t);
    }

    @Override
    public void saludar() {
        System.out.println("Por favor ingrese los datos...");
    }
}
