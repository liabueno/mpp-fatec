/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exercicio2;

/**
 *
 * @author julia
 */
// implements marca interface, não está estendendo está obrigando os métodos
public class Corinthians implements Torcedor{
    @Override
    // override garante esteja sobrescrevendo um método e não criando um novo
    public void torcer(){
        System.out.println("Timão eooo!");
    }
}
