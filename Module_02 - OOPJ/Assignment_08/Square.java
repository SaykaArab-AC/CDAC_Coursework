
class Square implements RegularPolygon {
	int length;

	public Square(int length) {
		this.length = length;
	}

	@Override
	public int getNumSide() {
		return 4;
	}

	@Override
	public int getSideLength() {
		return length;
	}
	
	static int totalSides(RegularPolygon[] polygons) {
		int sum=0;
		for(int iTemp=0;iTemp<polygons.length;iTemp++) {
			sum+=polygons[iTemp].getNumSide();
		}
		return sum;
	}
}
