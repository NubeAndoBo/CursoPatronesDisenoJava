package com.nubeando.Iterador19;

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
public class ListaNumeros {

    private int numeros[];
    private int posicion;

    public ListaNumeros() {
        numeros = new int[10];
        posicion = 0;
    }

    public void agregar(int i) {
        numeros[posicion++] = i;
    }

    public ListaNumerosIterador iterador() {
        return new ListaNumerosIterador(numeros);
    }
}
