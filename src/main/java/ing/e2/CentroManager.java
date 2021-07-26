package ing.e2;

import java.util.ArrayList;
import java.util.List;

public class CentroManager
{
    private List<Centro> centros;

    public CentroManager() {
        this.centros = new ArrayList<>();
    }

    /// Obtiene el número de centros.
    public int getCentroSize() {
        return centros.size();
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
}

// vim: set et:
