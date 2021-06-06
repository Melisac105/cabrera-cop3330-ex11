package util;

import java.util.Scanner;

public class UsrInput {
    static Scanner input = new Scanner(System.in);

    static public double getEurosAmt() {
        System.out.print("How many euros are you exchanging? ");
        return input.nextDouble();
    }

    static public double getRate() {
        System.out.print("What is the exchange rate? ");
        return input.nextDouble();
    }
}
