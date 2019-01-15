class program6
{
	public static void main(String arg[])
	{
		int num1 = 25, num2 = 42, num3 = 89;
    	boolean result;
    	
    	// At least one expression needs to be true for result to be true
    	result = (num1 > num2) || (num3 > num1);
    	// result will be true because (number1 > number2) is true
    	System.out.println(result);
    			
    	// All expression must be true from result to be true	
    	result = (num1 > num2) && (num3 > num1);
    	// result will be false because	(number3 > number1) is false
    	System.out.println(result);
	}
}