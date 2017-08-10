import java.util.Scanner;

class Calculate1
{
	
	static double Celcius;
	static double Fahrenheit;
	static double Kelvin;
	
	public static void main(String[] args) 
		{
		Scanner scan=new Scanner(System.in);
		
		double Temperature,Calculate;
		
		Celcius=33.8 * Fahrenheit;
		Celcius=274.15 * Kelvin;
		Fahrenheit=255.92 * Kelvin;
		
		System.out.println("Which Temperature? (Celcius,Fahreneit,Kelvin):");
		Temperature=scan.nextDouble();
		System.out.println("Which Calculate?(Celcius,Fahreneit,Kelvin):");
		Calculate=scan.nextDouble();
		
		
		if (Temperature==Celcius)
		{
		System.out.println("your calculate "+ Fahrenheit);
		System.out.println("your calculate"+Kelvin);
		}
		if (Temperature==Fahrenheit)
		{
		System.out.println("your calculate "+Celcius);
		System.out.println("your calculate "+Kelvin);
		}
		if(Temperature==Kelvin)
		{
		System.out.println("your calculate "+Celcius);
		System.out.println("your calculate "+ Fahrenheit);
		}
		
		}
}