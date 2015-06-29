import java.io.*;

public class FileIO {

	public static void main(String[] args) 
	{
		try
	{
		// TODO Auto-generated method stub
		
		String filePath = "C:\\Users\\kjohnson116\\Documents\\OOP_week15.txt.docx";
		String iReadThis = Read(filePath);
		String originalWord = "dolor";
		String replaceWord = "hedon";
		String replacedString = Replace(iReadThis, originalWord, replaceWord);
		Write(replacedString, filePath);
	}
	
	catch (IOException ex)
	
	{
		
		System.out.println("Something went wrong while reading or writing from file");
		ex.printStackTrace();
	}
	
	catch(NullPointerException nullEx)
	{
		System.out.println("File path is null");
		nullEx.printStackTrace();
	}
	
}
	private static void Write(String replacedString, String filePath) throws IOException
	{
		
		FileWriter writer = null;
		try
		{
			writer = new FileWriter(filePath);
			writer.write(replacedString);
		}
		
		finally
		{
			if(writer != null)
			{
				writer.close();
			}
		}
	}

	private static String Replace(String iReadThis, String originalWord, String replaceWord)
	{
		String replacedString = null;
		
		if (iReadThis != null)
		{
			replacedString = iReadThis.replace(originalWord, replaceWord);
		}
		
		return replacedString;
	}

	public static String Read(String filePath) throws NullPointerException, IOException, FileNotFoundException
	{
		FileReader fileReader = null;
		String fullFile = null;
		BufferedReader bufferedReader = null;
		
		
		try
		{
			if (filePath == null)
			{
				throw new NullPointerException();
			}
			
			fileReader = new FileReader(filePath);
			bufferedReader = new BufferedReader(fileReader);
					
			StringBuilder builder = new StringBuilder();
			
			String iReadThis = bufferedReader.readLine();
			
			while(iReadThis != null)
			{
				builder.append(iReadThis);
				iReadThis = bufferedReader.readLine();
			}
			
			fullFile = builder.toString();
		}
	finally
	{
		if(fileReader != null)
		{
			fileReader.close();
		}
		
		if(bufferedReader !=null)
		{
			bufferedReader.close();
		}
	}
	
		return fullFile;
	}

}
