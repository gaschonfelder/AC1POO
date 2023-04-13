/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

public class Carro extends Veiculo {
    private Integer portencia;
    private Integer portas;
    private Integer pessoas;
    private String direcao;
    private String motor;

    public Carro(Integer portencia, Integer portas, Integer pessoas, String direcao, String motor, String modelo, String placa, String montadora, Integer ano, String cor) {
        super(modelo, placa, montadora, ano, cor);
        this.portencia = portencia;
        this.portas = portas;
        this.pessoas = pessoas;
        this.direcao = direcao;
        this.motor = motor;
    } 
    

    public Integer getPortencia() {
        return portencia;
    }

    public void setPortencia(Integer portencia) {
        this.portencia = portencia;
    }

    public Integer getPortas() {
        return portas;
    }

    public void setPortas(Integer portas) {
        this.portas = portas;
    }

    public Integer getPessoas() {
        return pessoas;
    }

    public void setPessoas(Integer pessoas) {
        this.pessoas = pessoas;
    }


    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }
    
    
    
    
}
