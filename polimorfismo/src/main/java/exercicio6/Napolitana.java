/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exercicio6;

/**
 *
 * @author julia
 */
public class Napolitana implements Pizza{
    @Override
    public void preparar(){
        System.out.println("molho, presunto, queijo, tomate, oregano");
    }

    @Override
    public void assar(){
        System.out.println("19 minutos");
    }

    @Override
    public void cobrar(){
        System.out.println("R$18,00");
    }
}
