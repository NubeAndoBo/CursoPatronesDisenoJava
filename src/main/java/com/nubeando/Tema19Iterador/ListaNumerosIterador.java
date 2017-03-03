package com.nubeando.Tema19Iterador;

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
public class ListaNumerosIterador implements Iterador {

    private int numeros[];
    private int posicion;

    public ListaNumerosIterador(int num[]) {
        this.numeros = num;
        this.posicion = 0;
    }

    @Override
    public Object siguiente() {
        return numeros[posicion++];
    }

    @Override
    public boolean tieneSiguiente() {
        if (posicion < numeros.length && numeros[posicion] != 0) {
            return true;
        } else {
            return false;
        }
    }
}
