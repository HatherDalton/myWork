package Interface;

public class personTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person bob = new Teacher();
		System.out.println("Teacher info:");
		System.out.println("Name: " + bob.getName());
		System.out.println("Age: " + bob.getAge());

		System.out.println("                ");

		bob = new Student();
		System.out.println("Student info:");
		System.out.println("Name: " + bob.getName());
		System.out.println("Age: " + bob.getAge());

		System.out.println("                ");

		Teacher adult = new Teacher();
		Student kid = new Student();
		adult.setName("Walter Renard");
		adult.payMe();
		kid.setName("Elenor");
		for (int i = 0; i < 3; i++)
			kid.outSick();

		Person people = adult;
		System.out.println("Teacher info:");
		System.out.println("Name: " + people.getName());
		System.out.println("Age: " + people.getAge());

		System.out.println("                ");

		people = kid;
		System.out.println("Student info:");
		System.out.println("Name: " + people.getName());
		System.out.println("Age: " + people.getAge());
	}

}
