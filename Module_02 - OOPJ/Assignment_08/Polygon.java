
public class Polygon {

	public static void main(String[] args) {
		RegularPolygon[] polygons= {
				new EquilateralTriangle(6),
				new Square(4),
				new EquilateralTriangle(20)
		};
		
		System.out.println("Total Sides = "+Square.totalSides(polygons));
		
		System.out.println("Triangle Perimeter = "+polygons[0].getPerimeter());
		System.out.println("Triangle Integrior Angle"+polygons[0].getInteriorAngle());

		System.out.println("Square Perimeter = "+polygons[1].getPerimeter());
		System.out.println("Square Integrior Angle"+polygons[1].getInteriorAngle());
	}
}
