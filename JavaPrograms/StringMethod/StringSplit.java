package StringMethod;



public class StringSplit {

	public static void main(String[] args) {
	
		String str = new String("I Have 200 and you have 300");
		
		System.out.println(str);
	
		String[] str1 = str.split(" ");
		int x = 0;		
		for (String st : str1) {
			
			if( isNumeric(st))
			{
			x = x + Integer.parseInt(st);	
			}
}
		
		System.out.println("Value X: " + x);
	
	}
	
	public static boolean isNumeric(String str)  
	{  
	  try  
	  {  
	    double d = Double.parseDouble(str);  
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return false;  
	  }  
	  return true;  
	}
	
	

}

