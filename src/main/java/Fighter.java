public class Fighter extends Spacecraft implements LandingCapable {
    private String weapon;

    //Constructors
    public Fighter(String universalIdentifier, String weapon) {
        //As extends spacecraft it needs a ID. Same with other spacecraft children.
        super(universalIdentifier);
        this.weapon = weapon;
    }
    //


    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public int getNumberOfRedquiredBays() {
        return 1;
    }
}
