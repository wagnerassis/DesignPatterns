/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Wagner Assis
 */
public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new FuncionarioBuilder("Joao", "098.098.400-20")
                                                        .bairro("Pinheiro")
                                                        .dataNascimento("10/10/1993")
                                                        .build();
        
        System.out.println(funcionario.getNome());
    }
}
