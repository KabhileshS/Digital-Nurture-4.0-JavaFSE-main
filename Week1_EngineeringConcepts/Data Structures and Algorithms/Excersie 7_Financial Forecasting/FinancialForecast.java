//   Recursion is when a method calls itself to solve smaller subproblems of a larger problem.
//   It often replaces loops and can simplify problems like:
//   Calculating factorials,Fibonacci numbers,Tree traversals.



//   Creating a method to calculate the future value using a recursive approach.

//   F(n) = F(n-1) × (1 + rate)

//   Where:
//   F(0) = present value
//   rate = expected constant growth per year




public class FinancialForecast {

    public static double predictFutureValue(int year, double currentValue, double growthRate) {
        if (year == 0) {
            return currentValue;
        }
        return predictFutureValue(year - 1, currentValue, growthRate) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double presentValue = 10000.0;
        double annualGrowthRate = 0.05;
        int years = 5;

        double futureValue = predictFutureValue(years, presentValue, annualGrowthRate);
        System.out.printf("Future Value after %d years: ₹%.2f\n", years, futureValue);
    }
}



//     Time Complexity of Financial Forecast is O(n) because it makes n recursive calls.
