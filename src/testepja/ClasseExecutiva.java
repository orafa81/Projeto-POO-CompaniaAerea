
package testepja;

public class ClasseExecutiva extends ClasseAerea{
    protected double adcExec = 0.95 * getValor();
    protected int[][] assento = new int[6][4];

    public int[][] getAssento() {
        return assento;
    }

    public void setAssento(int[][] assento) {
        this.assento = assento;
    }

    public double getAdcExec() {
        return adcExec;
    }

    public void setAdcExec(int adcExec) {
        this.adcExec = adcExec;
    }
    
    public double add(){
       return getAdcExec() + getValor();
    }
    
    
     public void exibirAssento(){
        for (int i = 0; i < 4; i++) {
            System.out.print("    ");
            System.out.print(i+1);
            
        }
        for (int i = 0; i < 6; i++) {
            System.out.println();
            System.out.printf("%d.  ", i + 1);
            for (int j = 0; j < 4; j++) {
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
        System.out.println("\n3. SERVIÇOS DA CLASSE EXECUTIVA");
        System.out.println("Refeição\n"
                + "Cadeira Reclinável\n"
                + "Pijama\n"
                + "Lençol\n"
                + "Louge");
    }
}
