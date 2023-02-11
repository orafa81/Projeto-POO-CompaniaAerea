
package testepja;

import java.util.Scanner;

public class TestePJA {
    public static Scanner input = new Scanner(System.in);
    public static Usuario u = new Usuario();
    public static Passageiro p = new Passageiro();
    public static PrimeiraClasse pc1 = new PrimeiraClasse();
    public static ClasseEconomica cec1 = new ClasseEconomica();
    public static ClasseExecutiva cex1 = new ClasseExecutiva();
    public static int opc = 0;
    public static int qtdAssento = 0;
    public static int cont = 0;
    
    public static void menuLogin(){
        System.out.print("Digite seu login: ");
        String login = input.next();
        System.out.print("Digite sua senha: ");
        String senha = input.next();
        try {
            u.verificaLogin(login, senha);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public static void menuCPassagem(int opcF){
        
        while(opcF == 1){
            String nome;
            String cpf;
            int telefone;
            String localEmb;
            String localDesem;
            if (qtdAssento == 0) {
                System.out.print("Digite seu nome: ");
                nome = input.next();
                System.out.print("Digite seu cpf: ");
                cpf = input.next();
                System.out.print("Digite seu telefone: ");
                telefone = input.nextInt();
                System.out.print("Digite seu Local de embarque: ");
                localEmb = input.next();
                System.out.print("Digite seu Local de Desembarque: ");
                localDesem = input.next();
                p.reservarPassagem(nome, cpf, telefone, localEmb, localDesem);
            }
            
            System.out.println("Agora escolha as seguintes opções de classes aerea");                
            pc1.servicos();
            cec1.servicos();
            cex1.servicos();
            int opcClasse;
            System.out.print("\nDigite o numero respectivo a classe que você deseja viajar: ");
            opcClasse = input.nextInt();
            if (opcClasse == 1) {
                pc1.exibirAssento();
                System.out.print("\nDigite os numeros respectivos ao assento desejado: ");
                int indexL = input.nextInt();
                int indexC = input.nextInt();
                pc1.compraAssento(indexL-1, indexC-1);
                System.out.println("Assento comprado com sucesso!");
                pc1.exibirAssento();
            } else if (opcClasse == 2) {
                cec1.exibirAssento();
                System.out.print("\nDigite os numeros respectivos ao assento desejado: ");
                int indexL = input.nextInt();
                int indexC = input.nextInt();
                cec1.compraAssento(indexL-1, indexC-1);
                cec1.exibirAssento();
            } else if (opcClasse == 3) {
                cex1.exibirAssento();
                System.out.print("\nDigite os numeros respectivos ao assento desejado: ");
                int indexL = input.nextInt();
                int indexC = input.nextInt();
                cex1.compraAssento(indexL-1, indexC-1);
                cex1.exibirAssento();
            }
            
            cont++;
            qtdAssento++;
            System.out.print("\nDigit 0 para sair ou 1 para comprar uma nova passagem: ");
            opc = input.nextInt();
            if (opc == 0) {
                opcF = 0;
                p.reservaPoltrona(qtdAssento);
                qtdAssento = 0;
            }
        }
    }
    
    public static void menuExibir(int opcF){
        while (opcF == 2) {            
            p.exibir();
            System.out.print("\nDigit 0 para sair: ");
            opc = input.nextInt();
            if (opc == 0) {
                opcF = 0;
            }
        }
    }
    
    public static void menuRPassagem(int opcF){
        while (opcF == 3) {            
            pc1.servicos();
            cec1.servicos();
            cex1.servicos();
            int opcClasse;
            System.out.print("\nDigite a classe aerea que você remarcar: ");
            opcClasse = input.nextInt();
            if (opcClasse == 1) {
                pc1.exibirAssento();
                System.out.print("\nDigite os numeros respectivos ao assento que você deseja remover: ");
                int indexL = input.nextInt();
                int indexC = input.nextInt();
                pc1.removerAssento(indexL-1, indexC-1);
                System.out.println("Assento removido com sucesso!");
                pc1.exibirAssento();
                System.out.println("\nAgora digite o assento que deseja remarcar: ");
                indexL = input.nextInt();
                indexC = input.nextInt();
                pc1.compraAssento(indexL-1, indexC-1);
                pc1.exibirAssento();
            } else if (opcClasse == 2) {
                cec1.exibirAssento();
                System.out.print("\nDigite os numeros respectivos ao assento que você deseja remover: ");
                int indexL = input.nextInt();
                int indexC = input.nextInt();
                cec1.removerAssento(indexL-1, indexC-1);
                System.out.println("Assento removido com sucesso!");
                cec1.exibirAssento();
                System.out.println("\nAgora digite o assento que deseja remarcar: ");
                cec1.compraAssento(indexL-1, indexC-1);
                cec1.exibirAssento();
            } else if (opcClasse == 3) {
                cex1.exibirAssento();
                System.out.print("\nDigite os numeros respectivos ao assento que você deseja remover: ");
                int indexL = input.nextInt();
                int indexC = input.nextInt();
                cex1.removerAssento(indexL-1, indexC-1);
                System.out.println("Assento removido com sucesso!");
                cex1.exibirAssento();
                System.out.println("\nAgora digite o assento que deseja remarcar: ");
                cex1.compraAssento(indexL-1, indexC-1);
                cex1.exibirAssento();
            }
            System.out.print("\nDigit 0 para sair ou 1 para comprar uma nova passagem: ");
            opc = input.nextInt();
            if (opc == 0) {
                opcF = 0;
                p.reservaPoltrona(qtdAssento);
                qtdAssento = 0;
            }
        }
    }
    
    public static void menuEPassagem(int opcF){
        while (opcF == 4) {            
            pc1.servicos();
            cec1.servicos();
            cex1.servicos();
            int opcClasse;
            System.out.print("\nDigite a classe aerea que você deseja excluir: ");
            opcClasse = input.nextInt();
            if (opcClasse == 1) {
                pc1.exibirAssento();
                System.out.print("\nDigite os numeros respectivos ao assento que você deseja remover: ");
                int indexL = input.nextInt();
                int indexC = input.nextInt();
                pc1.removerAssento(indexL-1, indexC-1);
                System.out.println("Assento removido com sucesso!");
                pc1.exibirAssento();
            } else if (opcClasse == 2) {
                cec1.exibirAssento();
                System.out.print("\nDigite os numeros respectivos ao assento que você deseja remover: ");
                int indexL = input.nextInt();
                int indexC = input.nextInt();
                cec1.removerAssento(indexL-1, indexC-1);
                System.out.println("Assento removido com sucesso!");
                cec1.exibirAssento();
            } else if (opcClasse == 3) {
                cex1.exibirAssento();
                System.out.print("\nDigite os numeros respectivos ao assento que você deseja remover: ");
                int indexL = input.nextInt();
                int indexC = input.nextInt();
                cex1.removerAssento(indexL-1, indexC-1);
                System.out.println("Assento removido com sucesso!");
                cex1.exibirAssento();
            }
            System.out.print("\nDigit 0 para sair ou 1 para comprar uma nova passagem: ");
            opc = input.nextInt();
            if (opc == 0) {
                opcF = 0;
                p.removePoltrona(1);
                p.reservaPoltrona(qtdAssento);
                qtdAssento = 0;
            }
        }
    }
    
    public static void menu1(){
        while (opc == 0) {
            if (cont == 0) {
                menuLogin();
            }
            if (u.getLogin() != null && u.getSenha() != null && opc == 0) {
                System.out.print("Seja Bem Vindo ao Menu Pricipal"
                        + "\nda Ispep Airline"
                        + "\n\nVeja as seguinte opições");
                System.out.print("\n\n1 - comprar passagem"
                        + "\n2 - visulizar"
                        + "\n3 - remarcar"
                        + "\n4 - cancelar\n\n");
                System.out.print("Digite a opc: ");
                opc = input.nextInt();
                if (opc == 1) {
                    menuCPassagem(opc);
                } else if (opc == 2) {
                    menuExibir(opc);
                } else if (opc == 3) {
                    menuRPassagem(opc);
                } else if (opc == 4) {
                    menuEPassagem(opc);
                }
       
            }
            
        }
    }
    
   
    public static void main(String[] args) {
        menu1();  
    }
}
