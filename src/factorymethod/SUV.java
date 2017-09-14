/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author Wagner Assis
 */
public class SUV implements Carro{
    private String specs;
    
    public SUV(String specs){
        this.specs = specs;
    }

    @Override
    public String getSpecs() {
        return specs;
    }

   
    
    
}
