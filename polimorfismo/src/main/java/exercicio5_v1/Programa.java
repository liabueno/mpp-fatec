/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exercicio5_v1;

/**
 *
 * @author julia
 */
public class Programa {
    public static void main(String[] args) {
        Forno forno = new Forno();

        Calabresa calabresa = new Calabresa();
        Napolitana napolitana = new Napolitana();

        forno.fabricar(calabresa);
        forno.fabricar(napolitana);
    }
}
