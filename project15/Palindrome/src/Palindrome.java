
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String stringUno = "go dog";
		String stringDos = "hair";
		
		boolean isStringUnoPalindrome = IsPalindrome(stringUno);
		boolean isStringDosPalindrome = IsPalindrome(stringDos);
		
		if(isStringUnoPalindrome)
		{
			System.out.println(stringUno + " is a palindrome.");
		}
		else
		{
			System.out.println(stringUno + " is not a palindrome.");
		}
		
		if (isStringDosPalindrome)
		{
			System.out.println(stringDos + " is a palindrome.");
		}
		
		else
		{
			System.out.println(stringDos + " is not a palindrome.");
		}

		

	}

	
	public static boolean IsPalindrome(String wordInput)
	{
		boolean isPalindrome = true;
		
		if (wordInput != null)
		{
			String wordInputNoSpaceAndLowerCase = wordInput.replace(" ", "").toLowerCase();
			char[] wordInputChars = wordInputNoSpaceAndLowerCase.toCharArray();
			
			for(int i = 0, k= wordInputChars.length - 1; i < wordInputChars.length/2; i++, k--)
			{
				if (wordInputChars[i] != wordInputChars[k])
				{
					isPalindrome = false;
					break;
				}
			}
		}
		else
		{
			System.out.println("You gave me a null string :(");
		}
		
		return isPalindrome;
	}
	
}
