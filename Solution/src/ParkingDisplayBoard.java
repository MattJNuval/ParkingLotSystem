public class ParkingDisplayBoard {

    //region INSTANCES, CONSTRUCTORS, GETTERS AND SETTERS

    //region INSTANCES
    private String id;
    private HandicappedSpot handicappedSpot;
    private CompactSpot compactSpot;
    private LargeSpot largeFreeSpot;
    private ElectricSpot electricFreeSpot;
    //endregion

    //region CONSTRUCTORS
    public ParkingDisplayBoard() {}

    public ParkingDisplayBoard(String id, HandicappedSpot handicappedSpot, CompactSpot compactSpot, LargeSpot largeFreeSpot, ElectricSpot electricFreeSpot) {
        this.id = id;
        this.handicappedSpot = handicappedSpot;
        this.compactSpot = compactSpot;
        this.largeFreeSpot = largeFreeSpot;
        this.electricFreeSpot = electricFreeSpot;
    }
    //endregion

    //region GETTERS AND SETTERS
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HandicappedSpot getHandicappedSpot() {
        return handicappedSpot;
    }

    public void setHandicappedSpot(HandicappedSpot handicappedSpot) {
        this.handicappedSpot = handicappedSpot;
    }

    public CompactSpot getCompactSpot() {
        return compactSpot;
    }

    public void setCompactSpot(CompactSpot compactSpot) {
        this.compactSpot = compactSpot;
    }

    public LargeSpot getLargeFreeSpot() {
        return largeFreeSpot;
    }

    public void setLargeFreeSpot(LargeSpot largeFreeSpot) {
        this.largeFreeSpot = largeFreeSpot;
    }

    public ElectricSpot getElectricFreeSpot() {
        return electricFreeSpot;
    }

    public void setElectricFreeSpot(ElectricSpot electricFreeSpot) {
        this.electricFreeSpot = electricFreeSpot;
    }
    //endregion

    //endregion

    public void showEmptySpotNumber() {
        // TODO: Implementation
    }
}
