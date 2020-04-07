public class Probe extends Spacecraft {
    //Properties
    private boolean active;

    //Constructors
    public Probe(String universalIdentifier, boolean active) {
        super(universalIdentifier);
        this.active = active;
    }


//Methods

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
