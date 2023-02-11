/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package testepja;

/**
 *
 * @author Micro
 */
public interface PainelPassageiro {
    public void reservarPassagem(String nome,String cpf,int telefone, String localembarq, String localdesem);
    public void reservaPoltrona(int qtdAssento);
    public void removePoltrona(int qtd);
    public void exibir();
}
