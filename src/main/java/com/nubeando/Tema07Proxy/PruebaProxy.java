package com.nubeando.Tema07Proxy;

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
public class PruebaProxy {

    PersonaProxy persona;

    public static void main(String... args) {
        PruebaProxy pp = new PruebaProxy();
    }

    public PruebaProxy() {
        persona = new PersonaProxy();
        persona.saludar();
        persona.decirEstado();
        persona.despedirse();
    }
}
