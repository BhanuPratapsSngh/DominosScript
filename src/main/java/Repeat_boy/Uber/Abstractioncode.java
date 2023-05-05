package Repeat_boy.Uber;
abstract class Bankkapata {
	  public abstract void bank_details();
	  public void bank_name() {
	    System.out.println("SBI");
	  }
	}
	class banklock extends Bankkapata {
	  public void bank_details() {
	    String name="Bhanu ji";
	    long Account_number=11021377;
	    System.out.println("Your name is " + name + "  and account number is " +Account_number );
	  }
	  
	}
public class Abstractioncode {
	  public static void main(String[] args) {
		  banklock bank = new banklock();
		  bank.bank_details();
		  bank.bank_name();
}}
