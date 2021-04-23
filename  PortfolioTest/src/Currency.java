public class Currency implements Portfolio {
private double amount ;

    public Currency(double amount) {
        super();
        this.amount =amount;
    }

    @Override
    public double marketVal() {
        return amount;
    }

    @Override
    public double profit() {
        return 0;
    }
    @Override
    public String toString() {
        return "Cash ( $ " + amount+")";
    }


}
