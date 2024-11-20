package calculator;

public class Calculator {

    public int calculate(int accumulator, int operand, String operator) throws IllegalOperationException, InvalidOperandException {
        int result = 0;

        switch (operator) {
            case "+":
                result = accumulator + operand;
                break;
            case "-":
                result = accumulator - operand;
                break;
            case "*":
                result = accumulator * operand;
                break;
            case "/":
                if (operand != 0) {
                    result = accumulator / operand;
                } else {
                    throw new IllegalOperationException();
                }
                break;
            case "%":
                result = accumulator % operand;
                break;
            case "And":
                result = accumulator & operand;
                break;
            case "Nand":
                result = ~(accumulator & operand);
                break;
            case "Or":
                result = accumulator | operand;
                break;
            case "Xor":
                result = accumulator ^ operand;
                break;
            case "Not":
                result = ~accumulator;
                break;
            case "Nor":
                result = ~(accumulator | operand);
                break;
            default:
                throw new InvalidOperandException();
        }
        return result;
    }
    public class InvalidOperandException extends Exception
    {
    	public InvalidOperandException()
    	{
    		super("Error: Invalid operand. Please enter a valid operand!");
    	}
    }
    
    public class IllegalOperationException extends Exception
    {
    	public IllegalOperationException()
    	{
    		super("Error: Invalid operation. Please enter a valid operation!");
    	}
    }
}