package oop;
//import statements at the top
public class EmployeeTest {
	// instance field-data storage
	// constructor- methods for constructing the object
	//default constructor
	public EmployeeTest()
	{
	
		Employee bob = new Employee();
		bob.setWage(4);
		System.out.println(bob.getWage());
		bob.setExp(5);
		System.out.println(bob.getExp());
	}
	//methods- things the object can do
}

