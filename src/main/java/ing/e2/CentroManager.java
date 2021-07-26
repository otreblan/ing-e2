package ing.e2;

import java.util.ArrayList;
import java.util.List;

public class CentroManager
{
    private List<Centro> centros;

    public CentroManager() {
        this.centros = new ArrayList<>();
    }

    public void addNewCentro() {
        centros.add(new Centro());
    }

    public void deleteCentro(int i) {
        centros.remove(i);
    }

    /// Obtiene el número de centros.
    public int getCentroSize() {
        return centros.size();
    }

    /// Obtiene el número de personas.
    public int getPersonaSize() {
        int s = 0;
        for(Centro centro : centros) {
            s += centro.getPersonaSize();
        }
        return s;
    }

    public int getPartialVaxxSize() {
        int s = 0;
        for(Centro centro : centros) {
            s += centro.getPartialVaxxSize();
        }
        return s;
    }

    public int getCompleteVaxxSize() {
        int s = 0;
        for(Centro centro : centros) {
            s += centro.getCompleteVaxxSize();
        }
        return s;
    }

    public double getCoverage() {
        double n = getPersonaSize();

        if(n==0.0)
            return 0.0;

        return (getPartialVaxxSize()+getCompleteVaxxSize())/n;
    }
}

// vim: set et:
