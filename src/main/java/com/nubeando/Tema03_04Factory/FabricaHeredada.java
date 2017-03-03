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
public class FabricaHeredada extends FabricaAbstracta {

    // Se implementa el método en esta fabrica específica
    @Override
    protected Conexion creaConexion(String tipo) {
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
