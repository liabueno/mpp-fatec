/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exercicio7;

/**
 *
 * @author julia
 */
public class Programa {
    public static void main(String[] args) {
            Venda venda = new Venda();

            // Pagamento com Boleto
            venda.vender(new Boleto(), 100.00);

            // Pagamento com Cartão de Crédito
            venda.vender(new CartaoCredito(), 100.00);

            // Pagamento com Dinheiro
            venda.vender(new Dinheiro(), 100.00);
    }
}
