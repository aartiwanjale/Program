import java.util.*;
public class Rect
{
	Double lenth , width, rect;
	Double pi =3.14;
	Double redius, circle;
	Scanner sc = new Scanner(System.in);
	
	public void re()
	{
		System.out.println("Enter the Lenth & Width = ");
		lenth = sc.nextDouble();
		width = sc.nextDouble();
		rect = lenth * width ;
		System.out.println("Rectangular = " + rect);
	}
	public void area()
	{
		System.out.println("Enter the redius = ");
		redius = sc.nextDouble();
		circle = pi * redius * redius;
		System.out.println(" area =" + circle);
	}
	public static void main(String a[])
	{
		Rect r = new Rect();
		r.re();
		r.area();
	}
}
