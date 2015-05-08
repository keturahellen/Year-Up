
public class Circle {
 String m_color;
 double m_radius;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
	}
 
		Circle(double radius)
		{
		m_color="grey";	 
		m_radius= radius;
 
		}
		Circle(double radius, String color)
		{
		m_radius= radius;
		m_color=  color;
		}
  
	
		double CalculateArea()
		{
		double area = 3.14 * m_radius * m_radius;
		return area;
		}
 
		void PrintColor()
		{
		System.out.println("My circle color is " + m_color + ".");
		}
}
