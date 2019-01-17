class program6
{
	public static void main(String arg[])
	{
		int num1 = 25, num2 = 42, num3 = 89;
    	boolean result;
    	
    	    	result = (num1 > num2) || (num3 > num1);
    	   	System.out.println(result);
    			
    		
    	result = (num1 > num2) && (num3 > num1);
    	
    	System.out.println(result);
	}
}