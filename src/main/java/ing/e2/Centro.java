package ing.e2;

import java.util.ArrayList;
import java.util.List;

public class Centro
{
    private List<Persona> personas;

    public Centro() {
        this.personas = new ArrayList<>();
    }

    /// Obtiene el número de personas.
    public int getPersonaSize() {
        return personas.size();
    }
}

// vim: set et:
