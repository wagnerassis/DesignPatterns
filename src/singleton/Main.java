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
public class Main {
    public static void main(String[] args) {
        SingletonData.getInstance().setKey("Singleton-key");
        new Pessoa().globalKey();
        new Carro().globalKey();
        System.out.println(SingletonData.getInstance().getKey());
    }
}
