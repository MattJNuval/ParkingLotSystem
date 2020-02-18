public class Vehicle {
    //region INSTANCES, CONSTRUCTORS, GETTERS AND SETTERS

    //region INSTANCES
    private String licenseNumber;
    private VehicleType type;
    //endregion

    //region CONSTRUCTORS
    public Vehicle() {

    }

    public Vehicle(String licenseNumber, VehicleType type) {
        this.licenseNumber = licenseNumber;
        this.type = type;
    }
    //endregion

    //region GETTERS AND SETTERS
    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }
    //endregion

    //endregion

    public void assignTicket() {
        // TODO: Implementation
    }

}
