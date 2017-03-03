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
public class Fabrica {
    // Nombre del tipo de conexión

    protected String tipo;

    // Constructor que recibe el
    // nombre del tipo de conexión
    public Fabrica(String t) {
        tipo = t;
    }

    // Metodo que retorna el objeto
    // conexión específico
    public Conexion creaConexion() {
        if (tipo.equalsIgnoreCase("Oracle")) {
            return new OracleConexion();
        } else if (tipo.equalsIgnoreCase("SQLServer")) {
            return new SqlServerConexion();
        } else if (tipo.equalsIgnoreCase("MySql")) {
            return new MySqlConexion();
        } else {
            return new PostgresqlConexion();
        }
    }
}
