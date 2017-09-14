/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Wagner Assis
 */
public class Factory {
    public final Map<String, Carro> prototypes = new HashMap<>();
    public Factory() {
        prototypes.put("Ferrari", new Ferrari());
        prototypes.put("Corolla", new Corolla());
        prototypes.put("Uni", new Uno());
    }
    
    public Carro getPrototype(String type){
        try{
            return prototypes.get(type).clone();
        }catch(NullPointerException ex){
            return null;
        }
    }
    
    public Map<String, Carro> getPrototypes(){
        return prototypes;
    }
}
