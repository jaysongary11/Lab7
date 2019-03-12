
import java.util.PriorityQueue;

public class PriorityQueueHospital<PatientType>  extends Hospital
{
	private PriorityQueue<PatientType> priorityQueue = new PriorityQueue<PatientType>();
	
	public void addPatient(Object patient)
	{
		priorityQueue.add((PatientType)patient);
	}
	
	public PatientType nextPatient()
	{
		PatientType nextPatient = priorityQueue.peek();
		return nextPatient();
	}
	
	public PatientType treatNextPatient()
	{
		PatientType treatNextPatient = priorityQueue.remove();
		return treatNextPatient;
	}
	
	public int numPatients()
	{
		return priorityQueue.size();
	}
	
	public String hospitalType()
	{
		return "PriorityQueueHospital";
	}
	
	public String allPatientInfo()
	{
		return priorityQueue.toString();
	}
}
