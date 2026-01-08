package how_to;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *  Reference article: <a href="https://www.baeldung.com/java-round-decimal-number">baeldung/java-round-decimal-number</a>
 */
public class Round_decimal_number {
    public static void main(String[] args) {
        Round_decimal_number roundDecimalNumber = new Round_decimal_number();
        double pi = Math.PI;
        System.out.println("PI: " + pi);
        int scale = 2;
        double roundDecimal = roundDecimalNumber.roundDecimal(pi, scale);
        System.out.println("Rounded PI: " + roundDecimal + " with scale: " + scale);
    }

    public double roundDecimal(double rawDecimal, int scale) {
        BigDecimal roundedBigDecimal = new BigDecimal(rawDecimal).setScale(scale, RoundingMode.HALF_UP);
        double roundedDouble = roundedBigDecimal.doubleValue();
        return roundedDouble;
    }

}
