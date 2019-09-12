package gois.study.tdjdkata.functions;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReversePolishNotationTest {
    private ReversePolishNotation reversePolishNotation =
            new ReversePolishNotation();

    @Test(expected = NotReversePolishNotationError.class)
    public void emptyInputThrowsError() {
        reversePolishNotation.compute("");
    }

    @Test(expected = NotReversePolishNotationError.class)
    public void notANumberThrowsError() {
        reversePolishNotation.compute("a");
    }

    @Test
    public void oneDigitReturnsNumber() {
        assertThat(reversePolishNotation.compute("7")).isEqualTo(7);
    }

    @Test
    public void moreThanOneDigitReturnsNumber() {
        assertThat(reversePolishNotation.compute("120")).isEqualTo(120);
    }
}
