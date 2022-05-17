package ai.jobiak.core;

public class TestEmployee {

	public static void main(String[] args) {
		
	Address res1 = new Address("1-52", "bc colony", "bobbili", 7993306633L, 535124L);
	Address com1 = new Address("32-7", "siripuram", "visakhapatnam", 630046L, 535124L);
	
	Address res2 = new Address("31-4", "ramdev nagar", "guntoor", 900905688L, 467300L);
	Address com2 = new Address("32-7", "siripuram", "visakhapatnam", 630046L, 535124L);
	
	Employee emp1 = new Employee("hemanth yegireddy", "111A", "jobiak pvt ltd","software devoleper", com1, res1, "anil" );
	Employee emp2 = new Employee("harish yegireddy", "222B", "jobiak pvt ltd","Trainee", com2, res2, "anil");
	
	System.out.println(emp1);
	System.out.println(emp2);
	
	Employee empArray[] = new Employee[5];
	
	empArray[0] = emp1;
	empArray[1] = emp2;
	
	for(int i =0 ; i<empArray.length; i++) {
		System.out.println(empArray[i]);
		
	}
	
	
	
	}

}
