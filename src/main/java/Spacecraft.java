public abstract class Spacecraft {
    private String universalIdentifier;
    //Constructors

    public Spacecraft(String universalIdentifier) {
        this.universalIdentifier = universalIdentifier;
    }

    //
    //Methods

    public String getUniversalIdentifier() {
        return universalIdentifier;
    }

    public void setUniversalIdentifier(String universalIdentifier) {
        this.universalIdentifier = universalIdentifier;
    }
}
