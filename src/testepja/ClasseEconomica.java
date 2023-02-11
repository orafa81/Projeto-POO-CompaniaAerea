
package testepja;


public class ClasseEconomica extends ClasseAerea{
    protected double desconto = 0.30 * getValor();
     protected int[][] assento = new int[6][16];

    public int[][] getAssento() {
        return assento;
    }

    public void setAssento(int[][] assento) {
        this.assento = assento;
    }
    

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }
    
    public double desconto(){
       return getValor() - getDesconto();
    }
    
     public void exibirAssento(){
        for (int i = 0; i < 16; i++) {
            System.out.print("    ");
            System.out.print(i+1);
            
        }
        for (int i = 0; i < 6; i++) {
            System.out.println();
            System.out.printf("%d.  ", i + 1);
            for (int j = 0; j < 16; j++) {
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
        System.out.println("\n2. SERVIÇOS DA CASSE ECONOMICA");
        System.out.println("Refeição");
    }
}
