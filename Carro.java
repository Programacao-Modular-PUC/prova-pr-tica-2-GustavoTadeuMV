/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm_prova2_m;

/**
 *
 * @author 789956
 */
public  class Carro extends Veiculo implements Avaliavel, Inspecionavel {
    
    public int qtd_portas;
  
    public Carro(String placa, String modelo, int anoFabricacao, double valorDiaria, double quilometragem, StatusVeiculo status) {
        super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, status);
    }

    @Override
    public abstract void exibirDetalhes();
    
    @Override
    public abstract boolean possuiSeguroEspecial();
    
    @Override
    public abstract void avaliar(int nota);
    
    @Override
    public abstract void realizarInspecao();
    
}
