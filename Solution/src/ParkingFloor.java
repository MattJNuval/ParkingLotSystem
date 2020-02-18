public class ParkingFloor {

    //region INSTANCES, CONSTRUCTORS, GETTERS AND SETTERS

    //region INSTANCES
    private String name;
    private ParkingDisplayBoard parkingDisplayBoard;
    private CustomerInfoPortal customerInfoPortal;
    private ParkingSpot parkingSpot;
    //endregion

    //region CONSTRUCTORS
    public ParkingFloor(String name, ParkingDisplayBoard parkingDisplayBoard, CustomerInfoPortal customerInfoPortal, ParkingSpot parkingSpot) {
        this.name = name;
        this.parkingDisplayBoard = parkingDisplayBoard;
        this.customerInfoPortal = customerInfoPortal;
        this.parkingSpot = parkingSpot;
    }
    public ParkingFloor() {

    }
    //endregion

    //region GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ParkingDisplayBoard getParkingDisplayBoard() {
        return parkingDisplayBoard;
    }

    public void setParkingDisplayBoard(ParkingDisplayBoard parkingDisplayBoard) {
        this.parkingDisplayBoard = parkingDisplayBoard;
    }

    public CustomerInfoPortal getCustomerInfoPortal() {
        return customerInfoPortal;
    }

    public void setCustomerInfoPortal(CustomerInfoPortal customerInfoPortal) {
        this.customerInfoPortal = customerInfoPortal;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    //endregion

    //endregion

    public void updateDisplayBoard() {
        // TODO: Implementation
    }

    public void addParkingSpot() {
        // TODO: Implementation
    }

    public void assignVehicleToSpot() {
        // TODO: Implementation
    }

    public void freeSpot() {
        // TODO: Implementation
    }



}
