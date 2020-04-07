import org.graalvm.compiler.lir.StandardOp;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //DON'T need this as the list is static SolarSystem solarSystem = new SolarSystem();

        RockeyPlanet mercury = new RockeyPlanet("mercury", 0);
        RockeyPlanet venus = new RockeyPlanet("Venus", 0);
        RockeyPlanet earth = new RockeyPlanet("Earth", 0);
        RockeyPlanet mars = new RockeyPlanet("Mars", 0);

        //Gas planets
        GasPlanet jupiter = new GasPlanet("Jupiter", "Hydrogen");
        GasPlanet neptune = new GasPlanet("Neptune", "Hydrogen");
        GasPlanet uranus = new GasPlanet("Uranus", "Hydrogen");
        GasPlanet saturn = new GasPlanet("Saturn", "Hydrogen");


        //Add all planets as list below
        SolarSystem.planets.addAll(Arrays.asList(mercury, venus, earth, mars, jupiter, neptune, uranus, saturn));

        //Probes
        Probe AlexSat1 = new Probe("1", true);
        Probe AlexSat2 = new Probe("2", false);

        Fighter ITU1 = new Fighter("3", "Laser Sharks!");
        Fighter ITU2 = new Fighter("4", "Laser");
        Fighter ITU3 = new Fighter("5", "Missiles");

        ShuttleCraft ITUShuttle1 = new ShuttleCraft("6", 300, 0);
        ShuttleCraft ITUShuttle2 = new ShuttleCraft("7", 400, 0);

        //Add cargo
        ITUShuttle2.addCargo(200);
        ITUShuttle1.addCargo(100);
        ITUShuttle1.addCargo(300);

        //Ladning one fighter and two cargo ships
        mars.host(ITU1);
        mars.host(ITU2);
        //Cargo
        mars.host(ITUShuttle2);

        System.out.println("Current Occupied Bays: " + mars.occupiedBays);
        mars.unHost("7");
        System.out.println("Current Occupied Bays: " + mars.occupiedBays);

    }
}
