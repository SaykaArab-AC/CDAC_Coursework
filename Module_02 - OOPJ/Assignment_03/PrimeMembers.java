
public class PrimeMembers extends Member {
	int joiningYear;
	int joiningFees;
	boolean isActive=true;
	
	void display() {
		super.display();
		System.out.println("Joining Year : "+joiningYear);
		System.out.println("Joining Fees : "+joiningFees);
		System.out.println("Is Member Active ? : "+isActive);
	}

	public int getJoiningYear() {
		return joiningYear;
	}

	public void setJoiningYear(int joiningYear) {
		this.joiningYear = joiningYear;
	}

	public int getJoiningFees() {
		return joiningFees;
	}

	public void setJoiningFees(int joiningFees) {
		this.joiningFees = joiningFees;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	void getInfo() {
		super.getInfo();
		System.out.println("Enter Joining Year : ");
		joiningYear=ConsoleInput.getInt();
		System.out.println("Enter Joining Fees : ");
		joiningFees=ConsoleInput.getInt();
		System.out.println("Is Member Active (true/false) : ");
		isActive=ConsoleInput.getBoolean();
		
	}
}
