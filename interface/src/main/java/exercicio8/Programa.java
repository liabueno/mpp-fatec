/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exercicio8;

/**
 *
 * @author julia
 */
public class Programa {
        public static void main(String[] args) {
        Pedido pedido = new Pedido();

        // Entrega padrão
        pedido.processarEntrega(new EntregaPadrao(), "Rua A, 123");

        // Entrega expressa
        pedido.processarEntrega(new EntregaExpressa(), "Rua B, 456");

        // Retirada na loja
        pedido.processarEntrega(new RetiradaLoja(), "Rua C, 789");
    }   
}
