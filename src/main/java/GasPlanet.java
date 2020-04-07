public class GasPlanet extends Planet {
    public String mainGasName;

    //Constructors

    public GasPlanet(String name, String mainGasName) {
        super(name);
        this.mainGasName = mainGasName;
    }


    //

    public String getMainGasName() {
        return mainGasName;
    }

    public void setMainGasName(String mainGasName) {
        this.mainGasName = mainGasName;
    }
}
