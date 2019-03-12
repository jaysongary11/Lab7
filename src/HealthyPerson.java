
public class HealthyPerson extends Person
{
	
	public HealthyPerson(String name, int age, String reason) {
		super(name, age);
		
	}

	@Override
	protected int compareToImpl(Person p) {
		return 0;
	}

}
