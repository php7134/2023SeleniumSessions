package seleniumsessions;

public class Verify {
	
	public static boolean equalValues(String actualResult, String expResult)
	{
		if(actualResult.equals(expResult))
		{
			System.out.println(actualResult + "is equal to " + expResult );
			return true;
		}
		else
		{
			System.out.println(actualResult + "is not equal to " + expResult );
			return false;
		}
	}

	public static boolean containValues(String actualResult, String expResult)
	{
		if(actualResult.contains(expResult))
		{
			System.out.println(actualResult + " contains " + expResult );
			return true;
		}
		else
		{
			System.out.println(actualResult + " does not contains " + expResult );
			return false;
		}
		
	}

}
