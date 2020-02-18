import java.util.Date;

public class Payment extends CreditCardTransaction /* extends CashTransaction (Figure this out later)*/ {

    //region INSTANCES, CONSTRUCTORS, GETTERS AND SETTERS

    //region INSTANCES
    private Date creationDate;
    private double amount;
    private ParkingTicketStatus status;
    //endregion

    //region CONSTRUCTORS
    public Payment() {
    }

    public Payment(Date creationDate, double amount, ParkingTicketStatus status) {
        this.creationDate = creationDate;
        this.amount = amount;
        this.status = status;
    }
    //endregion

    //region GETTERS AND SETTERS
    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public ParkingTicketStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingTicketStatus status) {
        this.status = status;
    }
    //endregion

    //endregion

    public boolean initiateTransaction() {
        // TODO: Implementation
        return false;
    }
}
