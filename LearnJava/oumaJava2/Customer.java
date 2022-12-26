package oumaJava2;

public class Customer 
{
	// .........Data ..........
	String name ;
	int age;
	double balance;

	
	// ..... Methods .....
	public Customer() 
	{
		// TODO Auto-generated constructor stub
	}
	public Customer(String name)
	{
		this.name = name;
	}
	public Customer(String name, int age, double balance)
	{
		this.name = name;
		this.age = age;
		this.balance = balance;		
	}
	
	public void create_account(String customer_name, int customer_age, double starting_balance)
	{
		name = customer_name;
		age = customer_age;
		balance = starting_balance;
	}
	
	public void withdraw(float withdrawal_amount)
	{
		balance = balance - withdrawal_amount;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void print_balance()
	{
		System.out.println("Bank of Karuvadikuppam");
		System.out.println("-----------------------");
		System.out.println("customer Name          : "+name);
		System.out.println("Balance in the account : "+balance);
		System.out.println("-----------------------");
	}	

}
