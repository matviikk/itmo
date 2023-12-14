package Objects;

import java.util.Objects;
public class SpaceSuit extends Equipment {
    private boolean isWorn;

    public SpaceSuit(String name) {
        super(name);
        this.isWorn = true; // Изначально скафандр надет
    }

    public String takeOff() {
        if (isWorn) {
            isWorn = false;
            return "снял с себя " + getName();
        } else {
            return "Незнайка уже без скафандра.";
        }
    }

    public boolean isWorn() {
        return isWorn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpaceSuit spaceSuit = (SpaceSuit) o;
        return isWorn == spaceSuit.isWorn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isWorn);
    }

    @Override
    public String toString() {
        return "SpaceSuit{name=" + getName() + "}";
    }
}
