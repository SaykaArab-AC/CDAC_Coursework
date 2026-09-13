class Student
{
	String name;
	int roll_no;
	String phone_no;
	String address;
	
	public Student(String name, int roll_no, String phone_no, String address) {
		this.name = name;
		this.roll_no = roll_no;
		this.phone_no = phone_no;
		this.address = address;
	}

	public Student(String name, int roll_no) {
		this.name = name;
		this.roll_no = roll_no;
	}
	
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Roll No : "+roll_no);
		System.out.println("Phone No : "+phone_no);
		System.out.println("Address : "+address);
	}
	
}
