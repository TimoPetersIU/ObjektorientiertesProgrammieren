package t.peters.rechner;

enum Operation {
    ADDITION("+", (a, b) -> a + b),
    SUBTRAKTION("-",(a, b) -> a - b),
    MULTIPLIKATION("*", (a, b) -> a * b),
    DIVISION("/", (a, b) -> {
        if (b != 0)
            return a / b;
        else {
            System.out.println("Division durch Null nicht erlaubt!");
            return Double.NaN;
        }
    });


    private final ICalc calculator;
    private final String symbol;

    Operation(String symbol, ICalc calculator) {
        this.calculator = calculator;
        this.symbol = symbol;
    }

    public double calculate(double a, double b) {
        return calculator.calc(a, b);
    }

    public String getSymbol() {
        return symbol;
    }
}