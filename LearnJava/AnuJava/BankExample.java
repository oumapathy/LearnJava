package AnuJava;
import java.util.ArrayList;;

public class BankExample 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		OperatoreAccounts o = new OperatoreAccounts();
		o.createAccounts();
		o.printAccounts();
	}
	
}

class OperatoreAccounts
{
	ArrayList<Accounts> accountList = new ArrayList<Accounts>();
	void printAccounts()
	{
		System.out.println("Printing account list of all accounts");
		System.out.println("-------------------------------------");
		double total =0;
		
		for (int i = 0; i < accountList.size(); i++) 
		{
			Accounts ac=accountList.get(i);
		    System.out.println("Type: "+ac.type+" \tName :"+ac.accountName+" \tBalance: "+ac.balance);
		    total = total+ac.balance;
		}
		System.out.println("Total amount bank has : "+total);
	}
	
	void createAccounts()
	{
		SavingsAccounts ac1=new SavingsAccounts("Ouma");
		ac1.deposit(100);
		accountList.add(ac1);
		
		SavingsAccounts ac2=new SavingsAccounts("Anu");
		ac2.deposit(200);
		accountList.add(ac2);

		
		CheckingAccounts c1=new CheckingAccounts("Avinash");
		c1.deposit(300);
		accountList.add(c1);

		
		CheckingAccounts c2=new CheckingAccounts("Rithika");
		c2.deposit(330);
		accountList.add(c2);

		
		CreditCardAccounts d1=new CreditCardAccounts("Anu");
		d1.deposit(3300);
		accountList.add(d1);

	}
}

abstract class Accounts
{
	double balance;
	String accountName;
	String type;
	abstract void deposit(double deposit_amount);
	abstract void withdraw(double withdraw_amount);
	abstract void printBalance();
}

class SavingsAccounts extends Accounts
{
	SavingsAccounts(String name) 
	{
		accountName=name;
		type="Savings";
		
	}
	
	void deposit(double deposit_amount) {balance = balance + deposit_amount;}
	void withdraw(double withdraw_amount) {balance = balance-withdraw_amount;}
	void printBalance() {System.out.println("Savings Account Balance for "+accountName+" is :"+balance);}
	void somedeposit()
	{
	
	}
}

class CheckingAccounts extends Accounts
{
	CheckingAccounts(String name) {accountName=name;type="Checkin";}
	void deposit(double deposit_amount) {balance = balance + deposit_amount;}
	void withdraw(double withdraw_amount) {balance = balance-withdraw_amount;}
	void printBalance() {System.out.println("Checkin Account Balance for "+accountName+" is :"+balance);}
}

class CreditCardAccounts extends Accounts
{
	CreditCardAccounts(String name) {accountName=name;type="Credit";}
	void deposit(double deposit_amount) {balance = balance + deposit_amount;}
	void withdraw(double withdraw_amount) {balance = balance-withdraw_amount;}
	void printBalance() {System.out.println("CreditCard Account Balance for "+accountName+" is :"+balance);}
}
