package ing.e2;

public class Persona
{
    public enum State
    {
        SIN_VACUNA,
        VACUNA_PARCIAL,
        VACUNA_COMPLETA
    }

    private State state;
    private int   age;

    public Persona(int age) {
        this.state = State.SIN_VACUNA;
        this.age   = age;
    }

    public void vax() {
        switch(state) {
            case SIN_VACUNA:
                state = State.VACUNA_PARCIAL;
                break;

            case VACUNA_PARCIAL:
                state = State.VACUNA_COMPLETA;
                break;

            case VACUNA_COMPLETA:
                state = State.VACUNA_COMPLETA;
                break;
        }
    }

    public State getState() {
        return state;
    }

    public int getAge() {
        return age;
    }
}

// vim: set et:
