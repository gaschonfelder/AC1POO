/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcoes;

import Classes.Veiculo;

/**
 *
 * @author Gabriel
 */
public class ValidarPlaca {
    private Veiculo veiculo;
    
    public String validarPlaca(Veiculo veiculo) {
        String eon="";

    if (veiculo.getPlaca().length() > 0) {
       
        if (veiculo.getPlaca().length() < 7) {
            System.out.println("Placa invalida!");
            eon = "invalido";
        } else {
            if (!veiculo.getPlaca().matches("[aA-zZ]{3}[0-9][aA-zZ][0-9]{2}")) {
                System.out.println("Placa invalida!");
                eon = "invalido";
            }else{
                System.out.println("Placa valida!");
                eon = "valido";
            }
        }
    }
    return eon;
}
}
