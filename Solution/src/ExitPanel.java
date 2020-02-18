public class ExitPanel {

    //region INSTANCES, CONSTRUCTORS, GETTERS AND SETTERS
    private String id;

    public ExitPanel(String id) {
        this.id = id;
    }
    public ExitPanel() {

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
