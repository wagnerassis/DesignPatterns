/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author Wagner Assis
 */
public class Main {
    
    public static void main(String[] args) {
        FabricaDeRelogio fabrica = new FabricaHublot();
        RelogioLuxo relogioLuxo = fabrica.criarRelogioLuxo();
        RelogioNormal relogioNormal = fabrica.criarRelogioNormal();
        relogioLuxo.mostrarInfoLuxo();
        relogioNormal.mostrarInfoNormal();
        
        System.out.println("-----//------");
        
        fabrica = new FabricaApple();
        relogioLuxo = fabrica.criarRelogioLuxo();
        relogioNormal = fabrica.criarRelogioNormal();
        relogioLuxo.mostrarInfoLuxo();
        relogioNormal.mostrarInfoNormal();
               
    }
}
