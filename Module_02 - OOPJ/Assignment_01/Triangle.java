
class Triangle
{
	int iSide1;
	int iSide2;
	int iSide3;

	Triangle(int iSide1,int iSide2,int iSide3)
	{
		this.iSide1=iSide1;
		this.iSide2=iSide2;
		this.iSide3=iSide3;
	}

	double area()
	{
		double dSemiPerimeter=(iSide1+iSide2+iSide3)/2.0;
		double dArea=Math.sqrt(dSemiPerimeter*(dSemiPerimeter-iSide1)*(dSemiPerimeter-iSide2)*(dSemiPerimeter-iSide3));
		return dArea;
	}

	int perimeter()
	{
		return iSide1+iSide2+iSide3;
	}
}
