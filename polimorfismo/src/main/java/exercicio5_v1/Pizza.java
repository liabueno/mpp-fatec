/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exercicio5_v1;

/**
 *
 * @author julia
 */
// não é o caminho mais eficaz criar uma classe para cada pizza
//dada a quantidade de sabores
//e com interface é possível determinar os mesmos métodos a todas as pizzas
public interface Pizza {
    void preparar();
    void assar();
    void cobrar();
}
