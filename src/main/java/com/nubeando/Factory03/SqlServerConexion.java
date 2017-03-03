package com.nubeando.Factory03;

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
public class SqlServerConexion extends Conexion {
    //Constructor vacio

    public SqlServerConexion() {
    }

    //Se sobreescribe el método descripción
    @Override
    public String descripcion() {
        return "Conexion SqlServer";
    }
}
