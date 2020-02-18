public class ParkingLot {

    //region INSTANCES, CONSTRUCTORS, GETTERS, AND SETTERS
    private String id;
    private Location address;

    public ParkingLot() {

    }

    public ParkingLot(String id, Location address) {
        this.id = id;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Location getAddress() {
        return address;
    }

    public void setAddress(Location address) {
        this.address = address;
    }
    //endregion

    public boolean addParkingFloor() {
        // TODO: Implementation
        return false;
    }

    public boolean addEntrancePanel() {
        // TODO: Implementation
        return false;
    }

    public ParkingTicket getNewParkingTicket() {
        // TODO: Implementation
        return null;
    }

    public boolean isFull() {
        // TODO: Implementation
        return false;
    }
}
