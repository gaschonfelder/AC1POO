package Funcoes;
import Classes.*;
import java.util.Objects;
import Conexões.MySQL;
public class Insert {
    MySQL conectar = new MySQL();
    private Veiculo veiculo;
    public void Motoinsert(Moto moto){
        int status=0;
        conectar.conectaBanco();
        
        try {
            status = this.conectar.insertSQL("INSERT INTO moto ("
                    + "cilindrada,"
                    + "velocidadeMaxima,"
                    + "combustivel,"
                    + "partida,"
                    + "modelo,"
                    + "placa,"
                    + "montadora,"
                    + "ano,"
                    + "cor"
                + ") VALUES ("
                    + "'" + moto.getCilindrada()+ "',"
                    + "'" + moto.getVelocidadeMaxima() + "',"
                    + "'" + moto.getCombustivel() + "',"
                    + "'" + moto.getPartida() + "',"
                    + "'" + moto.getModelo() + "',"
                    + "'" + moto.getPlaca() + "',"
                    + "'" + moto.getMontadora() + "',"
                    + "'" + moto.getAno() + "',"
                    + "'" + moto.getCor() + "'"
                + ");");
                if(status == 1 ){
                    System.out.println("Moto cadastrada com sucesso");
                    
                }else{System.out.println("Houve algum problema de cadastro");
                }
        } catch (Exception e){
                System.out.println("Houve algum problema com a conexão do servidor");
                }
       finally {
        }
        conectar.fechaBanco();
        }
    
    public void Carroinsert(Carro carro){
        int status=0;
        conectar.conectaBanco();
        
        try {
            status = this.conectar.insertSQL("INSERT INTO carro ("
                    + "potencia,"
                    + "portas,"
                    + "pessoas,"
                    + "direcao,"
                    + "motor,"
                    + "modelo,"
                    + "placa,"
                    + "montadora,"
                    + "ano,"
                    + "cor"
                + ") VALUES ("
                    + "'" + carro.getPortencia()+ "',"
                    + "'" + carro.getPortas() + "',"
                    + "'" + carro.getPessoas() + "',"
                    + "'" + carro.getDirecao()+ "',"
                    + "'" + carro.getMotor()+ "',"
                    + "'" + carro.getModelo() + "',"
                    + "'" + carro.getPlaca() + "',"
                    + "'" + carro.getMontadora() + "',"
                    + "'" + carro.getAno() + "',"
                    + "'" + carro.getCor() + "'"
                + ");");
                if(status == 1 ){
                    System.out.println("Carro cadastrado com sucesso");
                    
                }else{System.out.println("Houve algum problema de cadastro");
                }
        } catch (Exception e){
                System.out.println("Houve algum problema com a conexão do servidor");
                }
       finally {
        }
        conectar.fechaBanco();
        }
    
    public void Caminhaoinsert(Caminhao caminhao){
        int status=0;
        conectar.conectaBanco();
        
        try {
            status = this.conectar.insertSQL("INSERT INTO caminhao ("
                    + "eixos,"
                    + "carga,"
                    + "transmissao,"
                    + "numeroRoda,"
                    + "torque,"
                    + "modelo,"
                    + "placa,"
                    + "montadora,"
                    + "ano,"
                    + "cor"
                + ") VALUES ("
                    + "'" + caminhao.getEixos()+ "',"
                    + "'" + caminhao.getCarga() + "',"
                    + "'" + caminhao.getTransmissão() + "',"
                    + "'" + caminhao.getNumeroRoda()+ "',"
                    + "'" + caminhao.getTorque()+ "',"
                    + "'" + caminhao.getModelo() + "',"
                    + "'" + caminhao.getPlaca() + "',"
                    + "'" + caminhao.getMontadora() + "',"
                    + "'" + caminhao.getAno() + "',"
                    + "'" + caminhao.getCor() + "'"
                + ");");
                if(status == 1 ){
                    System.out.println("Caminhão cadastrado com sucesso");
                    
                }else{System.out.println("Houve algum problema de cadastro");
                }
        } catch (Exception e){
                System.out.println("Houve algum problema com a conexão do servidor");
                }
       finally {
        }
        conectar.fechaBanco();
        }
}

