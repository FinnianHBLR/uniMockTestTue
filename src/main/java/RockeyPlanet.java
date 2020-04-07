import java.util.HashSet;
import java.util.Set;

public class RockeyPlanet extends Planet  {
    private Set<LandingCapable> landedSpacecrafts = new HashSet<>();
    public int occupiedBays;

    //Constructors

    public RockeyPlanet(String name, int occupiedBays) {
        super(name);
        this.occupiedBays = occupiedBays;
    }


    //

    public void host(Spacecraft spacecraft) {
    //Lets a Spacecraft Land and takes up bays

        //Check if the spacecraft can land first
        if(spacecraft instanceof LandingCapable){
            landedSpacecrafts.add((LandingCapable) spacecraft);
            occupiedBays = occupiedBays +((LandingCapable) spacecraft).getNumberOfRedquiredBays();
        }

    }

    public void unHost(String universalIdentifier){
    //Removes by universalIdentifier. Decreases occupiedBays
        for (LandingCapable spaceCraft: landedSpacecrafts) {
            if(spaceCraft instanceof Spacecraft) {
                //Checks instance.
                if(((Spacecraft) spaceCraft).getUniversalIdentifier() == universalIdentifier);
                //Checks ID.

                landedSpacecrafts.remove(spaceCraft);
                //Removes
                System.out.println(((Spacecraft) spaceCraft).getUniversalIdentifier() + "Removed");
                occupiedBays = occupiedBays- spaceCraft.getNumberOfRedquiredBays();
                //Removes from bays :D
                return;
                //Stops and quits method as this causes an error!

            }
        }


    }

    public int getOccupiedBays() {
        return occupiedBays;

    }


}
