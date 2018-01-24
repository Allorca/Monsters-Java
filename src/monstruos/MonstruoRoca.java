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
public class MonstruoRoca extends Monstruo {
    public MonstruoRoca(String nombre) {
        super(nombre);
    }
    
    @Override
    public String toString() {
        return "Monstruo " + super.getnombre() + ".";
    }
    
    @Override
    public String ataque() {
        return "¡Lanzarrocas!";
    }
    
    
   
    
}
