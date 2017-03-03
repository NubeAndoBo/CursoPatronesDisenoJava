package com.nubeando.Tema06Prototype;

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
public class Cuadrado implements Figura {

    private String nombre;
    private int posicionX, posicionY;

    public Cuadrado() {
    }

    @Override
    public void setNombre(String n) {
        this.nombre = n;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void mover(int x, int y) {
        this.posicionX = x;
        this.posicionY = y;
    }

    @Override
    public void getPosicion() {
        System.out.println("Cuadrado en x: " + this.posicionX);
        System.out.println("Cuadrado en y: " + this.posicionY);
    }

    @Override
    public Figura clonar() {
        Figura figura = new Cuadrado();
        figura.setNombre(this.nombre);
        figura.mover(this.posicionX, this.posicionY);
        return figura;
    }
}
