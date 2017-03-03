package com.nubeando.Memento17;

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

public class Memento {

    private ArrayList<ArrayList<Registro>> backup;

    public Memento() {
        backup = new ArrayList<ArrayList<Registro>>();
    }

    public void setBackup(ArrayList<Registro> bd) {
        ArrayList<Registro> lista = new ArrayList<Registro>();
        for (Registro registro : bd) {
            lista.add(registro);
        }
        backup.add(lista);
    }

    public ArrayList<Registro> getBackup(int i) {
        return backup.get(i);
    }

    public int getSize() {
        return backup.size();
    }
}
