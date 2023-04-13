/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Veiculo {
    private String modelo;
    private String placa;
    private String montadora;
    private Integer ano;
    private String cor;
    Scanner ler = new Scanner (System.in);

    public Veiculo(String modelo, String placa, String montadora, Integer ano, String cor) {
        this.modelo = modelo;
        this.placa = placa;
        this.montadora = montadora;
        //validação do ano do veiculo para somente acima de 1950
        if(ano >= 1950){
            this.ano = ano;
        }else{
            System.out.println("O ano informado está inválido.");
            do{
            System.out.println("Digite o ano novamente!");
            ano = ler.nextInt();
            }while(ano<=1950);
            this.ano = ano;
        }
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
    
}
