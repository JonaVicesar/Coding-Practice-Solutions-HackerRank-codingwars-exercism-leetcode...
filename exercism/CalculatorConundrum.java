package exercism;

public class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) throws IllegalOperationException {
    	if(operation == null) {
    		throw new IllegalArgumentException("Operation cannot be null");
    	}
    			
    	if(operation.isEmpty()) {
    		throw new IllegalArgumentException("Operation cannot be empty");
    	}
    		
    		
    	if(!operation.matches("[+\\-*/]")) {
    		throw new IllegalOperationException("Operation" + operation + "does not exist");
    	}
    	
    	int result = 0;
    	try {
    		
    		switch(operation) {
    		case "+":
    			result = operand1 + operand2;
    			break;
    		case "-":
    			result = operand1 - operand2;
    			break;
    		case "*":
    			result = operand1 * operand2;
    			break;
    		case "/":
    			if(operand2 == 0) {
    				throw new ArithmeticException();
    			}
    			result = operand1 / operand2;
    			break;
    		}
    		
    	}catch(ArithmeticException e ) {
    		throw new IllegalOperationException("Division by zero is not allowed", e);
    }

    	return operand1 + " " + operation + " " + operand2 + " = " + result; 
    	
    }
    
    
    
}
class IllegalOperationException extends Exception {
    public IllegalOperationException(String message) {
        super(message);
    }

	public IllegalOperationException(String string, ArithmeticException e) {
		// TODO Auto-generated constructor stub
	}
} 


