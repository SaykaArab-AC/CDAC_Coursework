public class Program
{
	public static void main(String[] args)
	{
		//Q1(a)
		Student objStudent1=new Student("John",2);

		System.out.println("Name : "+objStudent1.name);
		System.out.println("Roll No : "+objStudent1.roll_no);
		objStudent1.display();
		System.out.println("---------------------------------------");

		//Q1(b)
		Student objStudent2=new Student("Sam",1,"897327131","Mumbai");
		Student objStudent3=new Student("Alice",3,"213079132132","Pune");
		objStudent2.display();
		objStudent3.display();
		System.out.println("---------------------------------------");

		//Q2
		Triangle objTriangle=new Triangle(3,4,5);

		System.out.println("Area of Triangle : "+objTriangle.area());
		System.out.println("Perimeter of Triangle : "+objTriangle.perimeter());
		System.out.println("---------------------------------------");

		//Q3
		Rectangle objRectangle1=new Rectangle(4,5);
		Rectangle objRectangle2=new Rectangle(5,8);

		System.out.println("Area of Rectangle 1 : "+objRectangle1.area());
		System.out.println("Area of Rectangle 2 : "+objRectangle2.area());
		System.out.println("---------------------------------------");

		//Q4
//		System.out.print("Enter Real Part of Number1 : ");
//		int real1=ConsoleInput.getInt();
//
//		System.out.print("Enter Imaginary Part of Number1 : ");
//		int img1=ConsoleInput.getInt();
//
//		System.out.print("Enter Real Part of Number2 : ");
//		int real2=ConsoleInput.getInt();
//
//		System.out.print("Enter Imaginary Part of Number2 : ");
//		int img2=ConsoleInput.getInt();
//
//		Complex objComplex1=new Complex(real1,img1);
//		Complex objComplex2=new Complex(real2,img2);
//
//		Complex objSum=objComplex1.add(objComplex2);
//		Complex objDifference=objComplex1.subtract(objComplex2);
//		Complex objProduct=objComplex1.multiply(objComplex2);
//
//		System.out.print("Sum : ");
//		objSum.display();
//
//		System.out.print("Difference : ");
//		objDifference.display();
//
//		System.out.print("Product : ");
//		objProduct.display();
//		System.out.println("-----------------------------------------------");

		//Q5
		Employee objEmp1=new Employee("Robert",1994,50000,"64C-WallsStreat");
		Employee objEmp2=new Employee("Sam",2000,55000,"68D-WallsStreat");
		Employee objEmp3=new Employee("John",1999,60000,"26B-WallsStreat");

		System.out.println("Name\tYear of Joining\tSalary\tAddress");
		System.out.println(objEmp1.name+"\t"+objEmp1.yearOfJoining+"\t\t"+objEmp1.salary+"\t"+objEmp1.address);
		System.out.println(objEmp2.name+"\t"+objEmp2.yearOfJoining+"\t\t"+objEmp2.salary+"\t"+objEmp2.address);
		System.out.println(objEmp3.name+"\t"+objEmp3.yearOfJoining+"\t\t"+objEmp3.salary+"\t"+objEmp3.address);
		System.out.println("-----------------------------------------------");

		//Q6
		Employee objEmp=new Employee();

		objEmp.getInfo(400,18);

		System.out.println("Initial Salary : "+objEmp.getSalary()+"$");

		objEmp.addSal();
		objEmp.addWork();

		System.out.println("Final Salary : "+objEmp.getSalary()+"$");
		System.out.println("---------------------------------------");
	}
}