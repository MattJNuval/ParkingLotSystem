public class ParkingRate {

    //region INSTANCES, CONSTRUCTORS, GETTERS AND SETTERS
    private int hourNumber;
    private double rate;

    public ParkingRate() {}

    public ParkingRate(int hourNumber, double rate) {
        this.hourNumber = hourNumber;
        this.rate = rate;
    }

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

}
