/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

public class Moto extends Veiculo {
    private Integer cilindrada;
    private Integer velocidadeMaxima;
    private String combustivel;
    private String partida;

    public Moto(Integer cilindrada, Integer velocidadeMaxima, String combustivel, String partida, String modelo, String placa, String montadora, Integer ano, String cor) {
        super(modelo, placa, montadora, ano, cor);
        this.cilindrada = cilindrada;
        this.velocidadeMaxima = velocidadeMaxima;
        //validação do combustivel para alcool,gasolina ou diesel
        if(combustivel.matches("^(gasolina|alcool|diesel)$")){
            this.combustivel = combustivel;
        }else{
            System.out.println("Combustivel invalido");
            do{
            System.out.println("Digite o combustivel novamente!");
            combustivel = ler.next();
            }while(!combustivel.matches("^(gasolina|alcool|diesel)$"));
            this.combustivel = combustivel;
        }
        this.partida = partida;
    }

    public Integer getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Integer getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Integer velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }
    
    
}
