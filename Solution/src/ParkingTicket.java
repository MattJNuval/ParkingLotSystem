import java.util.Date;

public class ParkingTicket {

    //region INSTANCES, CONSTRUCTORS, GETTERS AND SETTERS

    //region INSTANCE
    private String ticketNumber;
    private Date issuedAt;
    private Date payedAt;
    private double payedAmount;
    private ParkingTicketStatus status;
    //endregion

    //region CONSTRUCTORS
    public ParkingTicket() {

    }

    public ParkingTicket(String tocketNumber, Date issuedAt, Date payedAt, double payedAmount, ParkingTicketStatus status) {
        this.ticketNumber = tocketNumber;
        this.issuedAt = issuedAt;
        this.payedAt = payedAt;
        this.payedAmount = payedAmount;
        this.status = status;
    }
    //endregion

    //region GETTERS AND SETTERS
    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Date getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(Date issuedAt) {
        this.issuedAt = issuedAt;
    }

    public Date getPayedAt() {
        return payedAt;
    }

    public void setPayedAt(Date payedAt) {
        this.payedAt = payedAt;
    }

    public double getPayedAmount() {
        return payedAmount;
    }

    public void setPayedAmount(double payedAmount) {
        this.payedAmount = payedAmount;
    }

    public ParkingTicketStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingTicketStatus status) {
        this.status = status;
    }
    //endregion

    //endregion

}
