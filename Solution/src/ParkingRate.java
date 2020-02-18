public class ParkingRate {

    //region INSTANCES, CONSTRUCTORS, GETTERS AND SETTERS

    //region INSTANCES
    private int hourNumber;
    private double rate;
    //endregion

    //region CONSTRUCTORS
    public ParkingRate() {}

    public ParkingRate(int hourNumber, double rate) {
        this.hourNumber = hourNumber;
        this.rate = rate;
    }
    //endregion

    //region GETTERS AND SETTERS
    public int getHourNumber() {
        return hourNumber;
    }

    public void setHourNumber(int hourNumber) {
        this.hourNumber = hourNumber;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    //endregion

    //endregion

}
