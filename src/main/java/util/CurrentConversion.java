package util;

public class CurrentConversion {
    static public double calcDollarsAmt(double eurosAmt, double rate) {
        double dollars = eurosAmt * rate;
        return Math.round(dollars * 100) / 100.0;
    }
}
