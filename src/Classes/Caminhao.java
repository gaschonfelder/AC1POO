/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;


public class Caminhao extends Veiculo{
    private Integer eixos;
    private Integer carga;
    private Integer transmissão;
    private Integer numeroRoda;
    private Integer torque;

    public Caminhao(Integer eixos, Integer carga, Integer transmissão, Integer numeroRoda, Integer torque, String modelo, String placa, String montadora, Integer ano, String cor) {
        super(modelo, placa, montadora, ano, cor);
        this.eixos = eixos;
        this.carga = carga;
        this.transmissão = transmissão;
        this.numeroRoda = numeroRoda;
        this.torque = torque;
    }
    
    public String toString() {
        String a = "\nINFORMAÇÕES MOTO:\n Modelo: "+this.getModelo()+"\n Placa: "+this.getPlaca()+"\n Montadora: "+this.getMontadora()+"\n Ano: "+this.getAno()+"\n Cor:"+this.getCor()+"\n Eixos: "+this.getEixos()+"\n Carga: "+this.getCarga()+"\n Transmissão: "+this.getTransmissão()+"\n Número de Rodas: "+this.getNumeroRoda()+"\n Torque: "+this.getTorque(); 
        return a;
    }
    
    public Integer getEixos() {
        return eixos;
    }

    public void setEixos(Integer eixos) {
        this.eixos = eixos;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    public Integer getTransmissão() {
        return transmissão;
    }

    public void setTransmissão(Integer transmissão) {
        this.transmissão = transmissão;
    }

    public Integer getNumeroRoda() {
        return numeroRoda;
    }

    public void setNumeroRoda(Integer numeroRoda) {
        this.numeroRoda = numeroRoda;
    }

    public Integer getTorque() {
        return torque;
    }

    public void setTorque(Integer torque) {
        this.torque = torque;
    }
    
}
