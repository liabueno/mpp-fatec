/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exercicio8;

/**
 *
 * @author julia
 */
public class Pedido {
    public void processarEntrega(TipoEntrega entrega, String endereco) {
        entrega.entregar(endereco);
    }
}
