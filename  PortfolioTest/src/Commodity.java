public class Commodity extends MyAssets{

    public int totalShares;

    public Commodity(String citi, double v) {
        setSymbol(citi);


    }


    public double marketVal(){
        return getCurrentPrice() * totalShares;
    }

    public double profit(){
        return marketVal() - getTotalCost();
    }

    public void purchase(int shares, double pricePerShare){
        totalShares += shares;
        totalCost += shares * pricePerShare;

    }

    public String toString()
    {
        return symbol +  " ( " +totalShares + " shares, $ " + totalCost + " total cost )";


    }

}


