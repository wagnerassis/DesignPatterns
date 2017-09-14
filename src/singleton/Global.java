/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author ilegra0195
 */
public abstract class Global {
    public void globalKey () {
        System.out.println(SingletonData.getInstance().getKey());   
    }
}
