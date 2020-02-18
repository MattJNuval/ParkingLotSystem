public class ParkingAttendantPortal {

    //region INSTANCES, CONSTRUCTORS, GETTERS, AND SETTERS

    //region INSTANCES
    private String id;
    //endregion

    //region CONSTRUCTORS
    public ParkingAttendantPortal() {

    }

    public ParkingAttendantPortal(String id) {
        this.id = id;
    }
    //endregion

    //region GETTERS AND SETTERS
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    //endregion

    //endregion

    public boolean scanTicket() {
        // TODO: Implementation
        return false;
    }

    public boolean processPayment() {
        // TODO: Implementation
        return false;
    }
}
