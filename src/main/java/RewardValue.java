public class RewardValue {


    double cash; // Cash value
    int miles; // Miles value
    final double rate = 0.0035;


    // Constructor that accepts cash value
    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = 0; // default value
    }

    // Constructor that accepts miles value
    public RewardValue(int miles) {
        this.miles = miles;
        this.cash = convertMilesToCash(miles);
    }

    // Method to convert from miles to cash at rate 0.0035
    private double convertMilesToCash(int miles) {
        return miles * 0.0035;  // Conversion rate: 0.0035 dollars per mile
    }

    // Getter method to return cash value
    public double getCashValue(){
        return cash;
    }

    // Getter method to return miles value
    public double getMilesValue(){
        return miles;
    }


}
