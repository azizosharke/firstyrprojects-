public  class MyAssets implements  Portfolio {
    public String symbol;
    public double totalCost;
    public double currentPrice;

    @Override
    public double marketVal() {
        return 0;
    }
    @Override
    public double profit() {
      return 0;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double curPrice) {
        this.currentPrice = curPrice;
    }

}
