/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exercicio7;

/**
 *
 * @author julia
 */
public class Boleto implements TipoPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento em boleto. Taxa fixa R$0,80");
    }
}