
public class CalculateArea {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
double RectangleArea= CalculateRectangleArea(4,2);
System.out.println("The area of the rectangle is " + RectangleArea + ".");

double CircleArea = CalculateCircleArea(16);
System.out.println("The area of the circle is " + CircleArea + ".");
	}
	
	static double CalculateCircleArea(int radius)
	
	{
		double area = 3.14 * radius * radius;
		return area ;
	}
	
	
	static double CalculateRectangleArea(int length,int breadth)
	{
		double area = length * breadth;
		return area;
	}
}

