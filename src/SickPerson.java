
public class SickPerson extends Person
{	
	private int severity;
	

	public SickPerson(String name, int age, int severity) {
		super(name, age);
		this.severity = severity;
	}


	
	protected int compareToImpl(Person p) {
		
		SickPerson sick = (SickPerson)p;
		return sick.severity-severity;
	}

}
