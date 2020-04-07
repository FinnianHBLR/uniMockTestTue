public  class ShuttleCraft extends Spacecraft implements LandingCapable {
    //For some reason a ShuttleCraft cannot remove cargo

    //Properties
    private long maxCargo;
    private long currentCargo;

    //Constructors
    public ShuttleCraft(String universalIdentifier, long maxCargo, long currentCargo) {
        super(universalIdentifier);
        this.maxCargo = maxCargo;
        this.currentCargo = currentCargo;
    }

    //Methods

    public long getMaxCargo() {
        return maxCargo;
    }

    public void setMaxCargo(long maxCargo) {
        this.maxCargo = maxCargo;
    }

    public long getCurrentCargo() {
        return currentCargo;
    }

    public void addCargo(long newCargo) {
     //Adds the caro amount to the total.
        if(canAcceptCargo(newCargo) == false) {
            System.out.println("Not Enough Spce In ship");

        } else {
            //If valid
            this.currentCargo += newCargo;
            System.out.println("Current Cargo Now is at:" + currentCargo);
        }

    }

    @Override
    public int getNumberOfRedquiredBays() {
        //Cast to an int eg 300 tons/100 = 3 bays
        return (int)maxCargo / 100;
    }

    protected boolean canAcceptCargo(long cargo){
        //Checks if there is space left.
        if(currentCargo + cargo > maxCargo ){

            return false;
        } else {
            return true;
        }
    }
}
