package Objects;

import Enums.EnvironmentType;
import Interfaces.Observable;
import java.util.Objects;

public class Neznaika implements Observable {
    private final String name;
    private boolean stumbled;
    private final SpaceSuit spaceSuit;
    private EnvironmentType type;

    public Neznaika(String name, SpaceSuit spaceSuit) {
        this.name = name;
        this.stumbled = false; // Начальная инициализация поля stumbled
        this.spaceSuit = spaceSuit; // Инициализация экземпляра SpaceSuit
        this.type = EnvironmentType.SPACE; // Нет воздуха
    }

    public String getNameInCase(String caseType) {
        switch (caseType) {
            case "nominative": // Именительный падеж
                return name + "а";
            case "genitive": // Родительный падеж
                return name + "и";
            default:
                return name;
        }
    }

    @Override
    public String observe(String surroundings) {
        return getNameInCase("nominative") + " огляделся по сторонам и увидел, что " + surroundings;
    }

    public String stumbleAndSitDown(String reason) {
        this.stumbled = true; // Устанавливаем флаг в true
        return "Правда, от " + reason + " ноги у " + getNameInCase("genitive") + " подкосились и он сел прямо на землю.";
    }

    public String detectAtmosphere(String observation) {
        type = EnvironmentType.EARTH; // Оказалось, что есть воздух
        return "Заметив, что " + observation + ", " + getNameInCase("nominative") + " сделал вывод, что вокруг имеется атмосфера, то есть воздух.";
    }
    public String takeOffSuitAndFeelAir(String action) {
        String takeOffResult = this.spaceSuit.takeOff();
        return getNameInCase("nominative") + " " + takeOffResult + " и " + action;
    }
    public String perceiveAirQuality(String realization) {
        if (!this.spaceSuit.isWorn()) {
            return "Ему даже показалось, что воздух вокруг " + realization;
        } else {
            return this.name + " не может сделать такое наблюдение, так как он все еще в скафандре.";
        }
    }
    public String conclusion(String reason){
        return "Но это ему, конечно, только так показалось, потому что " + reason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Neznaika neznaika = (Neznaika) o;
        return stumbled == neznaika.stumbled && Objects.equals(name, neznaika.name) && Objects.equals(spaceSuit, neznaika.spaceSuit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, stumbled, spaceSuit);
    }

    @Override
    public String toString() {
        return "Neznaika{name=" + name + "}";
    }
}
