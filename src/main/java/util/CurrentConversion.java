package util;

public class CurrentConversion {
    static public double calcDollarsAmt(double eurosAmt, double rate) {
        return Math.ceil(eurosAmt * rate);
    }
}
