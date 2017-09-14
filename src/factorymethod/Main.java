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
public class Main {
    public static void main(String[] args) {
        String currentSpecs;
        Carro carro = null;
        String specs = "SUV";
        
        if(specs.equalsIgnoreCase("Sedan")){
          carro = new Sedan(specs);  
        }
        else if(specs.equalsIgnoreCase("SUV")){
          carro = new SUV(specs); 
        }
        
        assert carro != null;
        currentSpecs = carro.getSpecs();
        System.out.println(currentSpecs);
    }
}
