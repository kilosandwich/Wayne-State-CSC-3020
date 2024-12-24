/******************************************************************************

Download class Account file (under Lab 05 link) and add it to your project.
Account class has the properties account number and balance, and methods to
deposit, withdraw, and toString. Create two subclasses for checking and saving
accounts. A checking account has a fee private data field and savings account has
an interest rate private data filed. Override toString method in each sub class; call
super class toString method from the sub class toString method.
Write a test program (TestAccount) that creates objects of SavingsAccount and
CheckingAccount and invokes their toString() methods.
Do not modify Account class or copy and paste the code.
Submit only one .java file (testAccount.java) that includes the two sub classes and
the test class.
Sample output


*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		CheckingAccount ca = new CheckingAccount(68, 35.0);
		SavingsAccount sa = new SavingsAccount(70, 25.0);
		System.out.println(ca.toString());
		System.out.println(sa.toString());
		
		//withdraw the money
		ca.withdraw(10);
		sa.withdraw(10);
		
		System.out.println(ca.toString());
		System.out.println(sa.toString());
	}
}



class Account {
  private int id;
  private double balance;


  public Account(int newId, double newBalance) {
    id = newId;
    balance = newBalance;
  }
  

  public int getId() {
    return this.id;
  }

  public double getBalance() {
    return balance;
  }

  public void setId(int newId) {
    id = newId;
  }

  public void setBalance(double newBalance) {
    balance = newBalance;
  }

  public void withdraw(double amount) {
    balance -= amount;
  }

  public void deposit(double amount) {
    balance += amount;
  }

  @Override
  public String toString() {
    return "Account id: "+ id +"\nAccount balance: "+ balance;
  }
}

class CheckingAccount extends Account{
    private double fee = 25.00;
    
    public CheckingAccount(int newId, double newBalance) {
        super(newId, newBalance);
    }
   
    
    public String toString(){
        return 
        "Checking Account "+
        "\nMonthly Fee: " + fee+
        "\nAccount id: "+ super.getId()+
        "\nAccount balance: "+ super.getBalance();
    }
}

class SavingsAccount extends Account{
    private double interestRate = 0.05;
    
    public SavingsAccount(int newId, double newBalance) {
        super(newId, newBalance);
    }
    
    
    public String toString(){
        return 
        "Savings Account "+
        "\nInterest Rate " + interestRate+
        "\nAccount id: "+ super.getId() +
        "\nAccount balance: "+ super.getBalance();
    }
}










