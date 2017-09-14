/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Wagner Assis
 */
public class SingletonData {
    private static volatile SingletonData instance;
    private String key;
    private SingletonData() {}
    
    public static SingletonData getInstance(){
        if(instance == null){
            synchronized (SingletonData.class) {
            if (instance == null) {
                instance = new SingletonData();
            }
        }
        }
        
        
        return instance;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
