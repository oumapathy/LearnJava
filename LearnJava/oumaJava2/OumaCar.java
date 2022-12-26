package learnJava;

public class OumaCar {
	int NoOfWheels = 0;
	String Model = "Empty";

	public OumaCar() {
		// TODO Auto-generated constructor stub
	}
	
	public OumaCar(String Model1, int wheels1 )
	{
		NoOfWheels = wheels1;
		Model = Model1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void printname()
	{
		System.out.println("Car details");
		System.out.println("Model is :"+Model);
		System.out.println("Number of Wheels: "+NoOfWheels);
	}

}
