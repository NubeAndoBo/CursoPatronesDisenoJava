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
import java.util.*;

public interface Robot {
    // Método que pone a trabajar al robot

    public void trabajar();

    /* Método que cargará las acciones
	   solicitadas por el builder
	   en tiempo de ejecución
     */
    public void cargaAcciones(List<Integer> accion);
}
