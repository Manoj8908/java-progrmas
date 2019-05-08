package StringMethod;

public class stringMethods {

	public static void main(String[] args) {
		
		String s1="my name is khan my name is java";  
		String s2="I Have 200 and you 100";
		String replaceString=s1.replace("is","was");//replaces all occurrences of "is" to "was" 
		String replaceString1=replaceString.replace("was", "is");
		System.out.println(replaceString);  
		System.out.println(replaceString1);
		
		int index = s1.indexOf("is");
		System.out.println(index);
		
		int lastindex = s1.lastIndexOf("is");
		System.out.println(lastindex);
		
		String[] split = s2.split(" ");
		int split1 = Integer.parseInt(s2);
		System.out.println(split1);
		
		
	}

}
