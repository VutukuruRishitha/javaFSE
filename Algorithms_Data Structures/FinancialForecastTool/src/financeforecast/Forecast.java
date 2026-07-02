package financeforecast;
public class Forecast {

    public static double futureValue(double currentValue, double growthRate, int years) {
        
        if (years == 0) {
            return currentValue;
        }

        return futureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {

        double presentValue = 1000.0;
        double growthRate = 0.10;
        int years = 5;

        double result = futureValue(presentValue, growthRate, years);

        System.out.println("Future Value after " + years + " years: " + result);
    }
}