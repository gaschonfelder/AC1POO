/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ac1poo;

import Classes.*;
import Funcoes.*;
public class AC1POO {

    
    public static void main(String[] args) {
        Carro c = new Carro(4, 4, 5, "cambio", "xL20113", "Eco Sport", "OVO1x22", "Wolks", 2012, "Azul");
        Moto m = new Moto(70, 150, "gasoso", "Mortal", "Spens", "ACB1x22", "Minhanhão", 1, "Preto e Vermelho");
        Caminhao ca = new Caminhao(8, 260, 120, 8, 100, "Xisco", "OVO4a33", "Maggi", 2021, "Branco");
        ValidarPlaca p = new ValidarPlaca();
        Insert i = new Insert();
        String eon = p.validarPlaca(m);
        if(eon == "valido"){
            i.Motoinsert(m);
        }
        String eon2 = p.validarPlaca(ca);
        String eon3 = p.validarPlaca(c);
        if(eon3 =="valido"){
            i.Carroinsert(c);
        }
        if(eon2 =="valido"){
            i.Caminhaoinsert(ca);
        }
        System.out.println(m.toString());
        System.out.println(c.toString());
        System.out.println(ca.toString());
    }
    
}
