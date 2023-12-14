import Enums.EnvironmentType;
import Objects.Neznaika;
import Objects.Parachute;
import Objects.SpaceSuit;
import Objects.Environment;

public class Main {
    public static void main(String[] args) {
        SpaceSuit spaceSuit = new SpaceSuit("космический скафандр");
        Neznaika neznaika = new Neznaika("Незнайк", spaceSuit);
        Parachute parachute = new Parachute("крылатый парашют");
        Environment environment = new Environment(EnvironmentType.EARTH);

        // Использование методов с аргументами
        System.out.println("Но " + neznaika.getNameInCase("nominative") + " опасался напрасно, так как " + parachute.deploy(", который был у него за спиной, замедлил падение."));
        System.out.println(neznaika.stumbleAndSitDown("неожиданного толчка"));
        System.out.println(parachute.fold("автоматически сложился у него за спиной, приняв вид капюшона."));
        System.out.println(neznaika.observe("кустиками с какими-то крошечными зелеными листиками."));
        System.out.println(neznaika.detectAtmosphere("листочки на кустах колебались"));
        System.out.println(environment.describeWind("Ведь обычно листья на деревьях колеблются не сами по себе; " +
                "в действительности листья колеблет ветер, а ветер, как теперь всем известно, " +
                "это не что иное, как движение воздуха."));
        System.out.println("Придя к такому умозаключению, " + neznaika.takeOffSuitAndFeelAir("почувствовал, что не только не задыхается, но даже вполне свободно может дышать."));
        System.out.println(neznaika.perceiveAirQuality("гораздо лучше того, которым он дышал на Земле."));
        System.out.println(neznaika.conclusion("он долго пробыл в скафандре и немного отвык от свежего воздуха."));
    }
}


