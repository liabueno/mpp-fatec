/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exercicio8;

/**
 *
 * @author julia
 */
public class RetiradaLoja implements TipoEntrega {
    @Override
    public void entregar(String endereco) {
        System.out.println("Retirada na loja. Endereço da loja: " + endereco + ". Disponível em duas horas.");
    }
}
