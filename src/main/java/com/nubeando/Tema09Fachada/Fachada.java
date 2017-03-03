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
public class Fachada {

    private Cpu miCPU;

    public Fachada() {
        miCPU = new Cpu();
    }

    public void encenderCPU() {
        miCPU.enviarVoltaje(110);
        miCPU.enviaEnergiaADispositivos();
        miCPU.reseteaContadores();
        miCPU.revisaBIOS();
        miCPU.revisaHardware();
        miCPU.asignaCanales();
        miCPU.revisaMemoria();
        miCPU.revisaEntradas();
        miCPU.buscaSectorArranque();
        miCPU.cargaBoot();
        miCPU.cargaSistemaOperativo();
        if (miCPU.cpuLista()) {
            System.out.println("\n");
            System.out.println("CPU ENCENDIDA Y LISTA PARA TRABAJAR!!!");
        }
    }

}
