/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula05;

public class Aula05 {

    public static void main(String[] args) {
       
        Conta p1 = new Conta();
        p1.setNumCon(11111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");//tem que passar esse parâmetro
        p1.depositar(100);//tem que passar o parâmetro 
        p1.estadoAtual();
        
        Conta p2 = new Conta();
        p2.setNumCon(22222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(1000);
        p2.estadoAtual();
        
       
    }
    
}
