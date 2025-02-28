/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exercicio6;

/**
 *
 * @author julia
 */
// parte 1 do exerc
public class AlhoBacon implements Pizza{
    @Override
    public void preparar() {
        System.out.println("molho, queijo, alho, bacon e tomate");
    }

    @Override
    public void assar() {
        System.out.println("18 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("R$ 15,00");
    }
}
