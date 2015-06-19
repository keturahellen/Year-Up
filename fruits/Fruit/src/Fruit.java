
public class Fruit {
	protected boolean m_hasSeeds;
	protected boolean m_needToPeel;
	protected String m_fruitName;
	
	
	protected boolean getSeeds()
	{
		return m_hasSeeds;
	}
	
	protected void setSeeds()
	{
		m_hasSeeds = false;
	}
	
	protected boolean getPeels()
	{
		 return m_needToPeel;
	}
	
	protected void setPeels()
	{
		m_needToPeel = false;
	}
	
	protected String getFruitName()
	{
		return m_fruitName; 
	}
	
	protected void setFruitName(String fruitName)
	{
		m_fruitName = fruitName;
	}
	
	protected void numberOfBites(int numBites)
	{
		String bites = "chomp";
		int j;
		
		for(j=0; j<numBites; j++)
		{
			System.out.println(bites);
		}
		
	protected void peelFruit()
	{
		if (m_needToPeel = true)
			System.out.println("peeled!");
		
		else if (m_needToPeel = false)
			System.out.println("ERROR!");
	}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
