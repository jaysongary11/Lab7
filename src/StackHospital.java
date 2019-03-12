import java.util.Deque;
import java.util.LinkedList;

public class StackHospital<PatientType> extends Hospital
{
	private Deque<PatientType> patientStack = new LinkedList<PatientType>();
	
	@Override
	public void addPatient(Object patient) {
		PatientType tempPatient = (PatientType)patient;
		patientStack.add(tempPatient);
		
	}
	public PatientType nextPatient()
	{
		PatientType nextPatient = patientStack.peek();
		return nextPatient;
	}
	
	public PatientType treatNextPatient()
	{
		PatientType nextPatient = patientStack.pop();
		return nextPatient;
	}
	
	public int numPatients()
	{
		return patientStack.size();
	}
	
	public String hospitalType()
	{
		return "StackHospital";
	}
	
	public String allPatientInfo()
	{
		return patientStack.toString();
	}

	
}
