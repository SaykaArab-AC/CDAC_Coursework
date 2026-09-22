
class EquilateralTriangle implements RegularPolygon {

	int length;
	
	public EquilateralTriangle(int length) {
		this.length = length;
	}

	@Override
	public int getNumSide() {
		return 3;
	}

	@Override
	public int getSideLength() {
		return length;
	}
}