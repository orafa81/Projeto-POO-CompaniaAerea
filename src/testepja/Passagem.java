
package testepja;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class Passagem {
    protected double preço = 200.00;
    ArrayList localEmb = new ArrayList();
    ArrayList localDesemb = new ArrayList();
    
    public Passagem(String localembarq, String localdesem) {
        this.localEmb.add(localembarq);
        this.localDesemb.add(localdesem);
    }

    public ArrayList getLocalEmb() {
        return localEmb;
    }

    public void setLocalEmb(ArrayList localEmb) {
        this.localEmb = localEmb;
    }

    public ArrayList getLocalDesemb() {
        return localDesemb;
    }

    public void setLocalDesemb(ArrayList localDesemb) {
        this.localDesemb = localDesemb;
    }

   

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }
    
    
    
    
}
