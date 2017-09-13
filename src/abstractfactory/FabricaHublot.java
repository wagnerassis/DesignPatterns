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
public class FabricaHublot implements FabricaDeRelogio {

    @Override
    public RelogioLuxo criarRelogioLuxo() {
        return new HublotLuxo();
    }

    @Override
    public RelogioNormal criarRelogioNormal() {
        return new HublotNormal();
    }
    
}
