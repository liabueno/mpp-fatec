/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exercicio7;

/**
 *
 * @author julia
 */
public class Venda {
    public void vender(TipoPagamento pagto, double valor) {
        pagto.pagar(valor);
    }
}
