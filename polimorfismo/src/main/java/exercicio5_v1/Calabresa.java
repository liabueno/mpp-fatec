/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exercicio5_v1;

/**
 *
 * @author julia
 */
public class Calabresa implements Pizza{
    @Override
    public void preparar(){
        System.out.println("molho, queijo, calabresa, cebola e tomate");
    }

    @Override
    public void assar(){
        System.out.println("15 minutos");
    }

    @Override
    public void cobrar(){
        System.out.println("R$ 12,00");
    }

}
