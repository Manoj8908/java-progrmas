package ArrayPrograms;

import java.util.Arrays;

public class StringSort2 {

	public static void main(String[] args) {
		
		
		String[] inputList = {"Arun","Manoj","Swagat","Bob","Amy","boby"};
		System.out.println("******Un-Sorted List********");
		showlist1(inputList);
		
		System.out.println("*******Sorted List********");
		Arrays.sort(inputList);
		showlist1(inputList);
		
		System.out.println("*******Sorted in case sensetive****");
		Arrays.sort(inputList, String.CASE_INSENSITIVE_ORDER);
		showlist1(inputList);
		
		
	}
		
		public static void showlist1(String[] array) {
			
			for(String str:array) {
				System.out.print(str+ " ");
			}
			System.out.println();
		}

	}

	
