package javapractice;

 class Bro{
		private String Company;
		private int Salary;

		public String getName() { 
			return Company; 
			}

		public void setName(String Company) {
			this.Company = Company; 
			}

		public int setSalary() {
			return Salary; 
			}

		public void setSalary(int Salary) {
			this.Salary = Salary; 
			}
	}

	public class Encapsulation  {
		public static void main(String[] args)
		{
			Bro person = new Bro();
			person.setName("Bebo");
			person.setSalary(300000);

			System.out.println("Copany Name: " + person.getName());
			System.out.println("SALARY    " + person.setSalary());
		}
	}
	


