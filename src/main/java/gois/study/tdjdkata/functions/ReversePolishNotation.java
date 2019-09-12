package gois.study.tdjdkata.functions;

public class ReversePolishNotation {
    int compute(String expression) {
        try {
            return (Integer.parseInt(expression));
        } catch (NumberFormatException e) {
            throw new NotReversePolishNotationError();
        }
    }
}
