import java.time.LocalDateTime;
import java.util.Date;

public class ElectricPanel {

    //region INSTANCES, CONSTRUCTORS, GETTERS AND SETTERS

    //region INSTANCES
    private int payedForMinutes;
    private LocalDateTime dateTime;
    //endregion

    //region CONSTRUCTORS
    public ElectricPanel() {}

    public ElectricPanel(int payedForMinutes, LocalDateTime dateTime) {
        this.payedForMinutes = payedForMinutes;
        this.dateTime = dateTime;
    }
    //endregion

    //region GETTERS AND SETTERS
    public int getPayedForMinutes() {
        return payedForMinutes;
    }

    public void setPayedForMinutes(int payedForMinutes) {
        this.payedForMinutes = payedForMinutes;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
    //endregion

    //endregion

    public boolean cancelCharging() {
        // TODO: Implementation 
        return false;
    }
}
