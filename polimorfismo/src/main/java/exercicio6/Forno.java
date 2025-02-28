/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exercicio6;

/**
 *
 * @author julia
 */
public class Forno {
    public void fabricar(Pizza pizza) {
        // Adicionando borda de Catupiry (parte 2 do exerc)
        System.out.println("Adicionando borda de Catupiry...");
        
        // pizza é uma ref POLIMÓRFICA
        // obj variável e dinâmico
        pizza.preparar();
        pizza.assar();
        pizza.cobrar();
    }
}
