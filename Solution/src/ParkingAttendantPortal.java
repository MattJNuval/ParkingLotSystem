public class ParkingAttendantPortal {

    //region INSTANCES, CONSTRUCTORS, GETTERS, AND SETTERS
    private String id;

    public ParkingAttendantPortal() {

    }

    public ParkingAttendantPortal(String id) {
        this.id = id;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
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
