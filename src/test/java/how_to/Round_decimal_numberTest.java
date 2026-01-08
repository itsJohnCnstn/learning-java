package how_to;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class Round_decimal_numberTest {

    @Test
    void main() {
        //Given
        Round_decimal_number roundDecimalNumber = new Round_decimal_number();
        double rawPi = Math.PI;
        //When
        int scale = 2;
        double result = roundDecimalNumber.roundDecimal(rawPi, scale);
        //Then
        double expected = 3.14d;
        assertThat(result)
                .isNotEqualTo(rawPi)
                .isEqualTo(expected);
    }

}