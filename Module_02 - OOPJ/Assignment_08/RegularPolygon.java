
public interface RegularPolygon {
	abstract int getNumSide();
	
	abstract int getSideLength();
	
	default double getPerimeter() {
		return getNumSide()*getSideLength();
	}
	
	default double getInteriorAngle() {
		return ((getSideLength()-2)*Math.PI)/getSideLength();
	}
}
