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
public class ListaPalabras {

    private String palabra1, palabra2, palabra3, palabra4, palabra5;
    private int posicion;

    public ListaPalabras() {
        posicion = 0;
    }

    public void agregar(String p) {
        switch (posicion) {
            case 0:
                palabra1 = p;
                break;
            case 1:
                palabra2 = p;
                break;
            case 2:
                palabra3 = p;
                break;
            case 3:
                palabra4 = p;
                break;
            case 4:
                palabra5 = p;
                break;
        }
        posicion++;
    }

    public ListaPalabrasIterador iterador() {
        return new ListaPalabrasIterador(palabra1, palabra2, palabra3, palabra4, palabra5);
    }
}
