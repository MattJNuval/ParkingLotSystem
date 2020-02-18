public class ParkingSpot {

    //region INSTANCES, CONSTRUCTORS, GETTERS AND SETTERS

    //region INSTANCES
    private String number;
    private boolean free;
    private ParkingSpotType type;
    //endregion

    //region CONSTRUCTORS
    public ParkingSpot() {

    }

    public ParkingSpot(String number, boolean free, ParkingSpotType type) {
        this.number = number;
        this.free = free;
        this.type = type;
    }
    //endregion

    //region GETTERS AND SETTERS
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public ParkingSpotType getType() {
        return type;
    }

    public void setType(ParkingSpotType type) {
        this.type = type;
    }
    //endregion

    //endregion

    public boolean getIsFree() {
        // TODO: Implementation
        return false;
    }
}
