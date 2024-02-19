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
    }),

    FAKULTAET("!", (a, b) -> {
        if (a >= 0 && a == (int) a) {
            int n = (int) a;
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        } else {
            System.out.println("Fakultät kann nur für nicht-negative ganze Zahlen berechnet werden!");
            return Double.NaN;
        }
    }),
    POTENZ("^", (a, b) -> Math.pow(a, b)),
    PROZENT("%", (a, b) -> (a * b) / 100);



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