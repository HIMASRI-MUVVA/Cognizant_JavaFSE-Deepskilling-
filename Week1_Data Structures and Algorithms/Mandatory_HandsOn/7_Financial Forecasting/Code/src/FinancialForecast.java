public class FinancialForecast {
    // Recursive method to calculate future value
    public static double futureValue(double presentValue, double growthRate, int years) {
        if (years == 0) return presentValue;
        return futureValue(presentValue, growthRate, years - 1) * (1 + growthRate);
    }
}
