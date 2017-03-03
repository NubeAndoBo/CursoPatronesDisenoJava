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
public abstract class CuentaBancaria {

    private String cuenta;
    private int saldo = 0;

    private void setCuenta(String c) {
        this.cuenta = c;
    }

    private void consignar(int i) {
        System.out.println("Consignando...");
        this.saldo += i;
    }

    private void retirar(int i) {
        System.out.println("Retirando...");
        if (i <= this.saldo - 10) {
            this.saldo -= i;
        } else {
            System.out.println("No se puede retirar ese monto.");
        }
    }

    private void consultarSaldo() {
        System.out.println("El saldo es: " + this.saldo);
    }

    protected void auditoria() {
        System.out.println("Se ha procesado la cuenta: " + this.cuenta);
    }

    public abstract void saludar();

    public void procesar(String c, int i, int t) {
        saludar();
        setCuenta(c);
        switch (t) {
            case 1:
                consignar(i);
                break;
            case 2:
                retirar(i);
                break;
            default:
                System.out.println("Opcion no valida");
        }
        consultarSaldo();
        auditoria();
    }
}
