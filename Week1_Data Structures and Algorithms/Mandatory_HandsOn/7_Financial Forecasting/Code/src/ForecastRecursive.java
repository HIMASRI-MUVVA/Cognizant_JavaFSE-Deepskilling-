import java.util.HashMap;

public class ForecastRecursive {
    private static final HashMap<Integer, Double> memo = new HashMap<>();

    public static double futureValueMemoized(double presentValue, double growthRate, int years) {
        if (years == 0) return presentValue;
        if (memo.containsKey(years)) return memo.get(years);

        double result = futureValueMemoized(presentValue, growthRate, years - 1) * (1 + growthRate);
        memo.put(years, result);
        return result;
    }
}

// Memoization - optimized version
