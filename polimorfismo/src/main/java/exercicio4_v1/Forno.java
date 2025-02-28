/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exercicio4_v1;

/**
 *
 * @author julia
 */
public class Forno {
    public void fabricar(PizzaCalabresa calabresa){
        calabresa.preparar();
        calabresa.assar();
        calabresa.cobrar();
    }

// versão 4.1 com erro consertado
    public void fabricar(PizzaNapolitana napolitana){
        napolitana.preparacao();
        napolitana.assamento();
        napolitana.valor();
    }   
}
