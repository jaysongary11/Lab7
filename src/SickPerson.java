
public class SickPerson extends Person
{	
	private String name;
	private int age;
	private int severity;
	

	public SickPerson(String name, int age, int severity) {
		super(name, age);
		this.name = name;
		this.age = age;
		this.severity = severity;
	}


	
	protected int compareToImpl(Person p) {
		// TODO Auto-generated method stub
		SickPerson sick = (SickPerson)p;
		return sick.severity-severity;
	}

}
