import java.time.LocalDateTime;
import java.util.Date;

public class ParkingTicket {

    //region INSTANCES, CONSTRUCTORS, GETTERS AND SETTERS

    //region INSTANCE
    private String ticketNumber;
    private LocalDateTime issuedAt;
    private LocalDateTime payedAt;
    private double payedAmount;
    private ParkingTicketStatus status;
    //endregion

    //region CONSTRUCTORS
    public ParkingTicket() {

    }

    public ParkingTicket(String tocketNumber, LocalDateTime issuedAt, LocalDateTime payedAt, double payedAmount, ParkingTicketStatus status) {
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

    public LocalDateTime getIssuedAt() {
        return issuedAt;
    }

    public void setIssuedAt(LocalDateTime issuedAt) {
        this.issuedAt = issuedAt;
    }

    public LocalDateTime getPayedAt() {
        return payedAt;
    }

    public void setPayedAt(LocalDateTime payedAt) {
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
