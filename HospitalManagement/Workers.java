package HospitalManagement;

public class Workers {
	private String name;
	private String surname;
	private String gender;
	private String specialization;
	private String DateOfDeployment;
	private int experience;
	private double PriceOfAppointment;
	private double salary;
	
	public Workers(String name, String surname, String gender, String specialization, String DateOfDeployment, 
			int experience, double PriceOfAppointment, double salary) {
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.specialization = specialization;
		this.DateOfDeployment = DateOfDeployment;
		this.experience = experience;
		this.PriceOfAppointment = PriceOfAppointment;
		this.salary = salary;
	} 
	
	public String getName() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getDateOfDeployment() {
		return DateOfDeployment;
	}

	public void setDateOfDeployment(String dateOfDeployment) {
		DateOfDeployment = dateOfDeployment;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public double getPriceOfAppointment() {
		return PriceOfAppointment;
	}

	public void setPriceOfAppointment(double priceOfAppointment) {
		PriceOfAppointment = priceOfAppointment;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

	
class ChiefPhysicians extends Workers{

		public ChiefPhysicians(String name, String surname, String gender, String specialization,
				String DateOfDeployment, int experience, double PriceOfAppointment, double salary) {
			super(name, surname, gender, specialization, DateOfDeployment, experience, PriceOfAppointment, salary);
			
		}
	
}


class Doctors extends Workers{

	public Doctors(String name, String surname, String gender, String specialization, String DateOfDeployment,
			int experience, double PriceOfAppointment, double salary) {
		super(name, surname, gender, specialization, DateOfDeployment, experience, PriceOfAppointment, salary);
		
	}
	
}


class Dentists extends Workers{

	public Dentists(String name, String surname, String gender, String specialization, String DateOfDeployment,
			int experience, double PriceOfAppointment, double salary) {
		super(name, surname, gender, specialization, DateOfDeployment, experience, PriceOfAppointment, salary);
		
	}
	
}


class Nurses extends Workers{

	public Nurses(String name, String surname, String gender, String DateOfDeployment,int experience, double salary) {
		super(name, surname, gender, null, DateOfDeployment, experience, 0, salary);
	
	}
	
}

class Security extends Workers{

	public Security(String name, String surname, String gender, String DateOfDeployment, double salary) {
		super(name, surname, gender, null, DateOfDeployment, 0, 0, salary);
		
	}
	
}


class HouseKeepers extends Workers{

	public HouseKeepers(String name, String surname, String gender, String DateOfDeployment, double salary) {
		super(name, surname, gender, null, DateOfDeployment, 0, 0, salary);
		
	}
	
}

class Receptionists extends Workers{

	public Receptionists(String name, String surname, String gender, String DateOfDeployment, double salary) {
		super(name, surname, gender, null, DateOfDeployment, 0, 0, salary);
		
	}
	
}


   //Patients
//----------------------------------------------------------------------------------------------------------------------------------------------------


class Patients{
	private String name;
	private String surname;
	private String gender;
	private String TypeOfDisease;
	private String DateOfRegistration;
	private String number;
	private String email;
	
	public Patients(String name, String surname, String gender, String typeOfDisease, String dateOfRegistration,
			String number, String email) {
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.TypeOfDisease = typeOfDisease;
		this.DateOfRegistration = dateOfRegistration;
		this.number = number;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTypeOfDisease() {
		return TypeOfDisease;
	}

	public void setTypeOfDisease(String typeOfDisease) {
		TypeOfDisease = typeOfDisease;
	}

	public String getDateOfRegistration() {
		return DateOfRegistration;
	}

	public void setDateOfRegistration(String dateOfRegistration) {
		DateOfRegistration = dateOfRegistration;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}


class BedPatients extends Patients{

	public BedPatients(String name, String surname, String gender, String typeOfDisease, String dateOfRegistration,
			String number, String email) {
		super(name, surname, gender, typeOfDisease, dateOfRegistration, number, email);
		
	}
	
}


class InfectiousPatients extends Patients{

	public InfectiousPatients(String name, String surname, String gender, String typeOfDisease, String dateOfRegistration,
			String number, String email) {
		super(name, surname, gender, typeOfDisease, dateOfRegistration, number, email);
		
	}
	
}


class ChronicPatients extends Patients{

	public ChronicPatients(String name, String surname, String gender, String typeOfDisease, String dateOfRegistration,
			String number, String email) {
		super(name, surname, gender, typeOfDisease, dateOfRegistration, number, email);
		
	}
	
}


class GeneticPatients extends Patients{

	public GeneticPatients(String name, String surname, String gender, String typeOfDisease, String dateOfRegistration,
			String number, String email) {
		super(name, surname, gender, typeOfDisease, dateOfRegistration, number, email);
		
	}
	
}


class CancerPatients extends Patients{

	public CancerPatients(String name, String surname, String gender, String typeOfDisease, String dateOfRegistration,
			String number, String email) {
		super(name, surname, gender, typeOfDisease, dateOfRegistration, number, email);
		
	}
	
}


class RespiratoryPatients extends Patients{

	public RespiratoryPatients(String name, String surname, String gender, String typeOfDisease, String dateOfRegistration,
			String number, String email) {
		super(name, surname, gender, typeOfDisease, dateOfRegistration, number, email);
		
	}
	
}


class EndocrinePatients extends Patients{

	public EndocrinePatients(String name, String surname, String gender, String typeOfDisease, String dateOfRegistration,
			String number, String email) {
		super(name, surname, gender, typeOfDisease, dateOfRegistration, number, email);
		
	}
	
}


class NeurologicalPatients extends Patients{

	public NeurologicalPatients(String name, String surname, String gender, String typeOfDisease, String dateOfRegistration,
			String number, String email) {
		super(name, surname, gender, typeOfDisease, dateOfRegistration, number, email);
		
	}
	
}


class SkinPatients extends Patients{

	public SkinPatients(String name, String surname, String gender, String typeOfDisease, String dateOfRegistration,
			String number, String email) {
		super(name, surname, gender, typeOfDisease, dateOfRegistration, number, email);
		
	}
	
}


class MentalPatients extends Patients{

	public MentalPatients(String name, String surname, String gender, String typeOfDisease, String dateOfRegistration,
			String number, String email) {
		super(name, surname, gender, typeOfDisease, dateOfRegistration, number, email);
		
	}
	
}




   //Rooms
//---------------------------------------------------------------------------------------------------------------------------------------------------

class Rooms{
	private String SurgeonName;
    private String SurgeonSurname;
    private String gender;
    private int number;
    private boolean equipment = true;
	
    public Rooms(String surgeonName, String surgeonSurname, String gender, int number, boolean equipment) {	
		this.SurgeonName = surgeonName;
		this.SurgeonSurname = surgeonSurname;
		this.gender = gender;
		this.number = number;
		this.equipment = equipment;
	}

	public String getSurgeonName() {
		return SurgeonName;
	}

	public void setSurgeonName(String surgeonName) {
		SurgeonName = surgeonName;
	}

	public String getSurgeonSurname() {
		return SurgeonSurname;
	}

	public void setSurgeonSurname(String surgeonSurname) {
		SurgeonSurname = surgeonSurname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getEquipment() {
		if(equipment==true) {
			return "Mövcuddur";
		}else {
			return "Mövcud deyil";
		}
	}

	public void setEquipment(boolean equipment) {
		this.equipment = equipment;
	}
     
}

class DiagnosticRooms extends Rooms{

	public DiagnosticRooms(String surgeonName, String surgeonSurname, String gender, int number, boolean equipment) {
		super(surgeonName, surgeonSurname, gender, number, equipment);
		
	}
	
}


class SurgeryRooms extends Rooms{

	public SurgeryRooms(String surgeonName, String surgeonSurname, String gender, int number, boolean equipment) {
		super(surgeonName, surgeonSurname, gender, number, equipment);
		
	}
	
}


class XrayRooms extends Rooms{
	private String name;
	private String surname;

	public XrayRooms(String name, String surname, String gender, int number) {
		super(name, surname, gender, number, false);
		this.name=name;
		this.surname=surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
    
}


class PatientsRooms extends Rooms{
	private String TypeOfDisease;
	private String condition;
	private String repairing;
	

	public PatientsRooms(String TypeOfDisease, String condition, String repairing,int number) {
		super(null, null, null,number,false);
		this.TypeOfDisease = TypeOfDisease;
		this.condition = condition;
		this.repairing = repairing;
		
	}

	public String getTypeOfDisease() {
		return TypeOfDisease;
	}

	public void setTypeOfDisease(String typeOfDisease) {
		TypeOfDisease = typeOfDisease;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	public String getRepairing() {
		return repairing;
	}

	public void setRepairing() {
		 this.repairing=repairing;
	}

	public void setRepairing(String repairing) {
		this.repairing = repairing;
	}
	
	
}


class StaffRooms extends Rooms{
	private String staffName;
	

	public StaffRooms(String staffName,int number) {
		super(null, null, null, number, false);
		this.staffName=staffName;
	}
	
	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	
}



  //Apppointments
//---------------------------------------------------------------------------------------------------------------------------------------------------
class Appointments {
	private String name;
	private String surname;
	private String gender;
	private String DateOfDeployment;
	private String number;
	private String Email;
	private String DoctorName;
	
	public Appointments(String name, String surname, String gender, String DateOfDeployment, String number, 
			String Email, String DoctorName) {
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.DateOfDeployment = DateOfDeployment;
		this.number = number;
		this.Email = Email;
		this.DoctorName = DoctorName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfDeployment() {
		return DateOfDeployment;
	}

	public void setDateOfDeployment(String dateOfDeployment) {
		DateOfDeployment = dateOfDeployment;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getDoctorName() {
		return DoctorName;
	}

	public void setDoctorName(String doctorName) {
		DoctorName = doctorName;
	}

	
}



//Queque
//---------------------------------------------------------------------------------------------------------------------------------------------------
class Queque {
	private String name;
	private String surname;
	private int desk;
	private String randomQueque;
	
	
	public Queque(String name, String surname, int desk, String randomQueque) {
		this.name = name;
		this.surname = surname;
		this.desk = desk;
		this.randomQueque = randomQueque;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public int getDesk() {
		return desk;
	}


	public void setDesk(int desk) {
		this.desk = desk;
	}


	public String getRandomQueque() {
		return randomQueque;
	}


	public void setRandomQueque(String randomQueque) {
		this.randomQueque = randomQueque;
	}

}


//Services
//---------------------------------------------------------------------------------------------------------------------------------------------------

class Services{
	private int reanimation = 270;
	private int urology = 190;
	private int ambulance = 155;
	private int GeneralSurgery = 235;
	private int dentistry = 315;
	private int pediatrics = 260;
	private int laboratory = 70;
	private int therapy = 280;
}


