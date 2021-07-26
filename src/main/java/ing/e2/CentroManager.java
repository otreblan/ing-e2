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
}

// vim: set et:
