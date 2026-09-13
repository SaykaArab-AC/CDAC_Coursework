
public class Rectangle extends Shape{
	int length;
	int breadth;
	
	
	public Rectangle() {
	}

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	int area() {
		return length*breadth;
	}
	
	int perimeter() {
		return 2*(length+breadth);
	}
	
	void print() {
		System.out.println("Area of Rectangle = "+area());
		System.out.println("Perimeter of Rectangle = "+perimeter());
	}
	
	void display() {
		super.display();
		System.out.println("This is Rectangle...");
	}
	
	public static void main(String[] args) {
		Rectangle r1=new Rectangle(15,3);
		System.out.println("Area = "+r1.area());
		System.out.println("Perimeter = "+r1.perimeter());
		System.out.println("-----------------------------------");
		
		Square s1=new Square(5);
		s1.print();
	}
}
