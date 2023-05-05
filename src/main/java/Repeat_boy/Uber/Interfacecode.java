package Repeat_boy.Uber;

interface school {
	  public  void school_details_details();
	}
	class schoolname implements school {
	  public void school_details_details() {
	    String name="Bhanu ji";
	    long Account_number=11021377;
	    System.out.println("Your name is " + name + "  and account number is " +Account_number );
	  }
	}
public class Interfacecode {
	  public static void main(String[] args) {
		  schoolname sco = new schoolname();
		  sco.school_details_details();
}}
