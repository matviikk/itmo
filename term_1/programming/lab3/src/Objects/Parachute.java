package Objects;

import Enums.ParachuteState;
import Interfaces.Foldable;
import java.util.Objects;

public class Parachute extends Equipment implements Foldable {
    private ParachuteState state;

    public Parachute(String name) {
        super(name);
        this.state = ParachuteState.FOLDED;
    }

    public String deploy(String msg) {
        state = ParachuteState.OPENED;
        return "небольшой " + getName() + msg;
    }

    public String fold(String msg) {
        state = ParachuteState.FOLDED;
        return "Парашют" + " " + msg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parachute parachute = (Parachute) o;
        return state == parachute.state;
    }

    @Override
    public int hashCode() {
        return Objects.hash(state);
    }

    @Override
    public String toString() {
        return "Parachute{name=" + getName() + ", state=" + state + "}";
    }
}
