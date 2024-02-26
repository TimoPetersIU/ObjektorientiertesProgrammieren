package t.peters.vorlesung8.rechner;

/**
 * Enum representing various mathematical operations.
 */
public enum Operation {

    // Addition operation
    ADDITION("+", (a, b) -> a + b),

    // Subtraction operation
    SUBTRACTION("-", (a, b) -> a - b),

    // Multiplication operation
    MULTIPLICATION("*", (a, b) -> a * b),

    // Division operation
    DIVISION("/", (a, b) -> {
        if (b != 0)
            return a / b;
        else {
            System.out.println("Division by zero is not allowed!");
            return Double.NaN;
        }
    }),

    // Factorial operation
    FACTORIAL("!", (a, b) -> {
        if (a >= 0 && a == (int) a) {
            int n = (int) a;
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        } else {
            System.out.println("Factorial can only be calculated for non-negative integers!");
            return Double.NaN;
        }
    }),

    // Exponentiation operation
    POWER("^", (a, b) -> Math.pow(a, b)),

    // Percentage operation
    PERCENT("%", (a, b) -> (a * b) / 100);

    private final ICalc calculator; // Calculator function for the operation
    private final String symbol;    // Symbol representing the operation

    /**
     * Constructor for Operation enum.
     *
     * @param symbol     The symbol representing the operation.
     * @param calculator The calculator function for the operation.
     */
    Operation(String symbol, ICalc calculator) {
        this.calculator = calculator;
        this.symbol = symbol;
    }

    /**
     * Calculates the result of the operation using the given operands.
     *
     * @param a The first operand.
     * @param b The second operand.
     * @return The result of the operation.
     */
    public double calculate(double a, double b) {
        return calculator.calc(a, b);
    }

    /**
     * Gets the symbol representing the operation.
     *
     * @return The symbol representing the operation.
     */
    public String getSymbol() {
        return symbol;
    }
}
