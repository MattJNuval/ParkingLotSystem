public class ParkingLot {

    //region INSTANCES, CONSTRUCTORS, GETTERS, AND SETTERS

    //region INSTANCES
    private String id;
    private Location address;
    private ParkingRate parkingRate;
    private EntrancePanel entrancePanel;
    private ExitPanel exitPanel;
    private ParkingAttendantPortal parkingAttendantPortal;
    private ParkingFloor parkingFloor;
    //endregion

    //region CONSTRUCTORS
    public ParkingLot() {

    }

    public ParkingLot(String id, Location address, ParkingRate parkingRate, EntrancePanel entrancePanel, ExitPanel exitPanel, ParkingAttendantPortal parkingAttendantPortal, ParkingFloor parkingFloor) {
        this.id = id;
        this.address = address;
        this.parkingRate = parkingRate;
        this.entrancePanel = entrancePanel;
        this.exitPanel = exitPanel;
        this.parkingAttendantPortal = parkingAttendantPortal;
        this.parkingFloor = parkingFloor;
    }
    //endregion

    //region GETTERS AND SETTERS
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

    public ParkingRate getParkingRate() {
        return parkingRate;
    }

    public void setParkingRate(ParkingRate parkingRate) {
        this.parkingRate = parkingRate;
    }

    public EntrancePanel getEntrancePanel() {
        return entrancePanel;
    }

    public void setEntrancePanel(EntrancePanel entrancePanel) {
        this.entrancePanel = entrancePanel;
    }

    public ExitPanel getExitPanel() {
        return exitPanel;
    }

    public void setExitPanel(ExitPanel exitPanel) {
        this.exitPanel = exitPanel;
    }

    public ParkingAttendantPortal getParkingAttendantPortal() {
        return parkingAttendantPortal;
    }

    public void setParkingAttendantPortal(ParkingAttendantPortal parkingAttendantPortal) {
        this.parkingAttendantPortal = parkingAttendantPortal;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }
    //endregion

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
