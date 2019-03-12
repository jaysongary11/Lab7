import java.util.LinkedList;
import java.util.Queue;

public class QueueHospital <PatientType> extends Hospital
{
	
	private Queue<PatientType> patientQueue = new LinkedList<PatientType>();
	
	
	public void addPatient(Object patient)
	{
		patientQueue.add((PatientType)patient);
	}
	
	public PatientType nextPatient()
	{
		PatientType nextPatient = patientQueue.peek();
		return nextPatient;
	}
	
	public PatientType treatNextPatient()
	{
		PatientType treatNextPatient = patientQueue.remove();
		return treatNextPatient;
	}
	
	public int numPatients()
	{
		int numPatients = patientQueue.size();
		return numPatients;
	}
	
	public String hospitalType()
	{
		return "QueueHospital";
	}
	
	public String allPatientInfo()
	{
		return patientQueue.toString();
	}
}
