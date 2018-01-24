/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monstruos;

/**
 *
 * @author Alexis
 */
public class Monstruo{

    protected String nombre;

    public Monstruo(String nombre) {
        this.nombre = nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getnombre() {
        return this.nombre;
    }

    @Override
    public String toString() {
        return "Monstruo " + this.getnombre() + ".";
    }
    
    public String ataque() {
        return " ";
    }

}
