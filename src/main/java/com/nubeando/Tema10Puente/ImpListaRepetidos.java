package com.nubeando.Tema10Puente;

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
import java.util.ArrayList;

public class ImpListaRepetidos implements I_ImplLista {

    private ArrayList<String> listaItems = new ArrayList<String>();

    @Override
    public void addItem(String item) {
        listaItems.add(item);
    }

    @Override
    public void remItem(String item) {
        if (listaItems.contains(item)) {
            listaItems.remove(listaItems.indexOf(item));
        }
    }

    @Override
    public int getCantidadDeItems() {
        return listaItems.size();
    }

    @Override
    public String getItem(int index) {
        if (index < listaItems.size()) {
            return (String) listaItems.get(index);
        }
        return null;
    }

    @Override
    public boolean soportaRepetidos() {
        return true;
    }
}
