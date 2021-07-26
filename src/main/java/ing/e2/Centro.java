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

    public int getPartialVaxxSize() {
        int s = 0;
        for(Persona persona : personas) {
            if(persona.getState() == Persona.State.VACUNA_PARCIAL) {
                s++;
            }
        }
        return s;
    }

    public int getCompleteVaxxSize() {
        int s = 0;
        for(Persona persona : personas) {
            if(persona.getState() == Persona.State.VACUNA_COMPLETA) {
                s++;
            }
        }
        return s;
    }
}

// vim: set et:
