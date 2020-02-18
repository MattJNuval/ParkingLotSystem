public class CashTransaction {

    private double cashTendered;

    public CashTransaction() {
    }

    public CashTransaction(double cashTendered) {
        this.cashTendered = cashTendered;
    }

    public double getCashTendered() {
        return cashTendered;
    }

    public void setCashTendered(double cashTendered) {
        this.cashTendered = cashTendered;
    }
}
