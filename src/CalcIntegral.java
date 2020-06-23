interface Function {
    double call(double x);
}

public class CalcIntegral {
    public static void main(String[] args) {
        System.out.println(integrate(x -> 1, 0, 10));//11.0
        System.out.println(integrate(x -> x + 2, 0, 10));//83.24999
        System.out.println(integrate(x -> Math.sin(x) / x, 1, 5));//0.5187404
    }

    public static double integrate(Function integral, double x, double z) {
        double result = 0;
        double step = 0.1;

        for (double i = x; i < z + 1; i += step) {
            result += integral.call(i) * step;
        }
        return result;
    }

}
