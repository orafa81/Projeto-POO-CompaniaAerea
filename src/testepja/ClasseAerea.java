
package testepja;


public abstract class ClasseAerea {
    protected int nAssento;
    protected int fileira;
    protected double valor = 300.00;
    protected int qtdPassagemC = 0;

    public int getNassento() {
        return nAssento;
    }

    public void setNassento(int nAssento) {
        this.nAssento = nAssento;
    }

    public int getFileira() {
        return fileira;
    }

    public void setFileira(int fileira) {
        this.fileira = fileira;
    }

    public double getValor() {
        return valor;
    }

    public int getQtdPassagemC() {
        return qtdPassagemC;
    }

    public void setQtdPassagemC(int qtdPassagemC) {
        this.qtdPassagemC = qtdPassagemC;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
