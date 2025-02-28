/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exercicio1;

/**
 *
 * @author julia
 */
public class Exerc1 {
    public static void main(String[] args) {
        // chamada método normal
        Torcedor torcedor = new Torcedor();
        torcedor.torcer();

        // chamadas polimórficas
        torcedor = new Corinthians();
        torcedor.torcer();

        torcedor = new Palmeiras();
        torcedor.torcer();

        torcedor = new Santos();
        torcedor.torcer();
    }
}
