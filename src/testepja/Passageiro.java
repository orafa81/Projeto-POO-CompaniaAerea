
package testepja;

import java.util.ArrayList;


public class Passageiro implements PainelPassageiro{
    protected ArrayList nome = new ArrayList();
    protected ArrayList cpf = new ArrayList();
    protected ArrayList telefone = new ArrayList();
    protected ArrayList qtdAssentos = new ArrayList();
    protected Passagem passagem;
    
    
    public Passageiro() {
        
    }

    public Passagem getPassagem() {
        return passagem;
    }

    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }

    public ArrayList getNome() {
        return nome;
    }

    public void setNome(ArrayList nome) {
        this.nome = nome;
    }

    public ArrayList getCpf() {
        return cpf;
    }

    public void setCpf(ArrayList cpf) {
        this.cpf = cpf;
    }

    public ArrayList getTelefone() {
        return telefone;
    }

    public void setTelefone(ArrayList telefone) {
        this.telefone = telefone;
    }

    @Override
    public void reservarPassagem(String nome, String cpf, int telefone, String localembarq, String localdesem) {
        this.nome.add(nome);
        this.cpf.add(cpf);
        this.telefone.add(telefone);
        
        Passagem addLocais = new Passagem(localembarq, localdesem);
        setPassagem(addLocais);
    }

    @Override
    public void reservaPoltrona(int qtdAssento) {
        this.qtdAssentos.add(qtdAssento);
    }

    @Override
    public void removePoltrona(int qtd) {
        int pegue;
        for (int i = 0; i < nome.size(); i++) {
            for (int j = i; j < i+1; j++) {
                pegue = (int) qtdAssentos.get(j);
                pegue = pegue - qtd;
                qtdAssentos.add(j, pegue);
            }
        }
    }

    @Override
    public void exibir() {
        for (int i = 0; i < nome.size(); i++) {
            System.out.println("\nPassagem " + (i+1));
            for (int j = i; j < i+1; j++) {
                System.out.println("Nome: " + nome.get(j));
                System.out.println("Cpf: " + cpf.get(j));
                System.out.println("Telefone: " + telefone.get(j));
                System.out.println("Qantidade de Poltronas: " + qtdAssentos.get(j));
            }
        }
    }    
}
