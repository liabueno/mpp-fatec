/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exercicio7;

/**
 *
 * @author julia
 */
public class CartaoCredito implements TipoPagamento {
    @Override
    public void pagar(double valor) {
        double taxa = valor * 0.20;
        System.out.println("Pagamento em cartão. Taxa de: R$" + taxa);
    }
}
