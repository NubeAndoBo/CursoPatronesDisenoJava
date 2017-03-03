package com.nubeando.Tema03_04Factory;

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
public abstract class FabricaAbstracta {

    // Constructor vacio
    public FabricaAbstracta() {
    }

    // Método que será implementado por
    // cada clase hija, y que será específico
    protected abstract Conexion creaConexion(String tipo);
}
