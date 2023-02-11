
package testepja;


public class PrimeiraClasse extends ClasseAerea{
    protected double addPriClasse = 0.70 * getValor();
    protected int assento[][] = new int[6][6]; 

    public double getAddPriClasse() {
        return addPriClasse;
    }

    public void setAddPriClasse(double addPriClasse) {
        this.addPriClasse = addPriClasse;
    }
    
    public double add(){
       return getAddPriClasse() + getValor();
    }

    public int[][] getAssento() {
        return assento;
    }

    public void setAssento(int[][] assento) {
        this.assento = assento;
    }
    
    
    public void exibirAssento(){
        for (int i = 0; i < 6; i++) {
            System.out.print("    ");
            System.out.print(i+1);
            
        }
        for (int i = 0; i < 6; i++) {
            System.out.println();
            System.out.printf("%d.  ", i + 1);
            for (int j = 0; j < 6; j++) {
                System.out.printf("%d    ",assento[i][j]);
                
            }
        }
            
    }
    
    public void compraAssento(int indexL, int indexC){
        assento[indexL][indexC] = 1;
    }
    
    public void removerAssento(int indexL, int indexC){
        if (assento[indexL][indexC] == 1) {
            assento[indexL][indexC] = 0;
        }    
    }
    
    public void servicos(){
        System.out.println("1. SERVIÇOS DA PRIMEIRA CLASSE");
        System.out.println("Refeição\n"
                + "Cadeira reclinável\n"
                + "Lençol");
    }
}
