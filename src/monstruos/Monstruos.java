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
public class Monstruos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MonstruoFuego foco = new MonstruoFuego("Charizard");
        MonstruoAgua aqui = new MonstruoAgua("Blastoiser");
        MonstruoRoca rock = new MonstruoRoca("Onyx");
        
        System.out.println(foco.ataque());
        System.out.println(aqui.ataque());
        System.out.println(rock.ataque());
    }
    
}
