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
public class Ferrari implements Carro{

    @Override
    public Carro clone() {
        return new Ferrari();
    }

    @Override
    public String toString() {
        return "Ferrari";
    }
    
    
    
}
