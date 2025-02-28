/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exercicio4_v1;

/**
 *
 * @author julia
 */
public class Programa {
    public static void main(String[] args) {
        Forno forno = new Forno();
        PizzaCalabresa calabresa = new PizzaCalabresa();

        forno.fabricar(calabresa);

        PizzaNapolitana napolitana = new PizzaNapolitana();
        forno.fabricar(napolitana);

        //motivo do erro: não tem método fabricar em forno relacionado a Pizza Napolitana
    }
}
