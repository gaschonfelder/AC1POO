/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ac1poo;

import Classes.*;
import Funcoes.*;
public class AC1POO {

    
    public static void main(String[] args) {
      //Veiculo a = new Veiculo("x", "abc1X22", "x", 2, "x");
      Moto m = new Moto(1, 1, "x", "x", "x", "ACB1x22", "x", 1, "z");
      ValidarPlaca p = new ValidarPlaca();
      //p.validarPlaca(a);
      p.validarPlaca(m);
      //System.out.println(a.getAno());
        System.out.println(m.getCombustivel());
    }
    
}
