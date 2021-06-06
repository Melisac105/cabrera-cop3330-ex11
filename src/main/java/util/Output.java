package util;

public class Output {

    static public void printOutput(double eurosAmt, double rate, double dollarsAmt) {
        System.out.format("%.2f euros at an exchange rate of %.4f is %.2f U.S. dollars.", eurosAmt, rate, dollarsAmt);
    }
}
