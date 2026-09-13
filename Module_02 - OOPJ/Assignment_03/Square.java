
public class Square extends Rectangle {
	
	int side;

	
	public Square() {

	}

	public Square(int side) {
		super();
		this.side = side;
	}
	
	int area() {
		return side*side;
	}
	
	int perimeter() {
		return 4*side;
	}
	
	void print() {
		super.print();
		System.out.println("Area of Square = "+area());
		System.out.println("Perimeter of Square = "+perimeter());
	}
	
	void display() {
		super.display();
		System.out.println("This is Square...");
	}
}
