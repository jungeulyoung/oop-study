package org.example;

public class SubstractionOperator implements NewArithmeticOperator{
    @Override
    public boolean supports(String operator) {
        return "-".equals();
    }

    @Override
    public int calculate(int operand1, int operand2) {
        return 0;
    }
}
