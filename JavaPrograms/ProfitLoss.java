package HelloWorld;

public class ProfitLoss {

    public static void main(String[] args) {

        double cost_price = 500;
        double selling_price = 650;

        if (selling_price > cost_price) {
            double profit = selling_price - cost_price;
            System.out.println("Profit = " + profit);
        }
        else if (cost_price > selling_price) {
            double loss = cost_price - selling_price;
            System.out.println("Loss = " + loss);
        }
        else {
            System.out.println("No Profit, No Loss");
        }
    }
}