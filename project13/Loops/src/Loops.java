
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]array1={6, 9, 5, 33, 4, 17, 6, 29, 21, 6, 93, 55 };
		
		
		SearchNumber(array1, 6);
		SearchOccurrences(array1, 6);

	}
	
	public static void SearchNumber(int[]array, int number)
	{
		if(array != null)
		{
			if (array.length > 0)
			{	
				
				for (int i=0; i<array.length; i++)
				{
					if(array[i]==number)
					{
						System.out.println("Your number, number " + number + ", was found at index " + i + " in this array.");
						break;
					}
				}
			}
		}
			
	}



public static void SearchOccurrences(int[]array, int number)
{
	if(array != null)
	{
		if (array.length >0)
		{
			int numberOfOccurrences = 0;
			for (int i = 0; i<array.length; i++)
			{
				if(array[i]==number)
				{
					numberOfOccurrences++;
				}
			}
			
			System.out.println("Your number, number " + number + " was found " + numberOfOccurrences + " times in this array.");
		}
	}
}
}
