import java.util.*;
class College
{
	String Name;
	int Rollno;
	double Mobileno;
	String Depatname;
	int intake;
	String Ho;
	//Scanner sc = new Scanner(System.in);
	
	public void sdetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name=");
		Name = sc.nextLine();
		//System.out.println("Name = " + Name);

		System.out.println("Enter the Rollno=");
		Rollno = sc.nextInt();
		//System.out.println("Rollno = " + Rollno);

		System.out.println("Enter the Mobileno=");
		Mobileno = sc.nextDouble();
		//System.out.println("Mobile Number = " + Mobileno);

		System.out.println("Name = " + Name);
		System.out.println("Rollno = " + Rollno);
		System.out.println("Mobile Number = " + Mobileno);
	}
	public void ddetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the D name=");
		Depatname= sc.nextLine();
		//System.out.println("Depat name = " + Depatname);

		//System.out.println("Enter the intake=");
		//intake = sc.nextInt();
		//System.out.println("Intake = " +intake);

		System.out.println("Enter the Hodname=");
		Ho = sc.nextLine();
		//System.out.println("Hod name = " + Ho);

		System.out.println("Enter the intake=");
		intake = sc.nextInt();
		//System.out.println("Intake = " +intake);

		System.out.println("Depat name = " + Depatname);
		System.out.println("Hod name = " + Ho);
		System.out.println("Intake = " +intake);
		

	}
	
	public static void main(String a[])
	{
		College c = new College();
		c.sdetails();
		c.ddetails();
	}
}
		



			
	