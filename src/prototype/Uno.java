/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author Wagner Assis
 */
public class Uno implements Carro{

    @Override
    public Carro clone() {
        return new Uno();
    }

    @Override
    public String toString() {
        return "Uno";
    }
    
    
    
}
