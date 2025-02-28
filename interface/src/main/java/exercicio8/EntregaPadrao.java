/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exercicio8;

/**
 *
 * @author julia
 */
public class EntregaPadrao implements TipoEntrega {
    @Override
    public void entregar(String endereco) {
        System.out.println("Entrega padrão no endereço: " + endereco + ". Prazo de 5 dias úteis.");
    }
}
