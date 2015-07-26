package Shapes;

public class Triangle extends Shape {
private Point apexA;
private Point apexB;
private Point apexC;
public Triangle(Point apexA, Point apexB, Point apexC) {
	super();
	this.apexA = apexA;
	this.apexB = apexB;
	this.apexC = apexC;
	this.shapeName="Triangle";
}
public Point getApexA() {
	return apexA;
}
public void setApexA(Point apexA) {
	this.apexA = apexA;
}
public Point getApexB() {
	return apexB;
}
public void setApexB(Point apexB) {
	this.apexB = apexB;
}
public Point getApexC() {
	return apexC;
}
public void setApexC(Point apexC) {
	this.apexC = apexC;
}

@Override
public double calcPerimeter() {
	return  this.apexA.calcDistance(this.getApexB()) + this.apexB.calcDistance(this.getApexC())+this.apexC.calcDistance(this.getApexA());
}
@Override
public double calcArea() {
	double p = this.calcPerimeter()/2;
	return  Math.sqrt(p * ( p - this.apexA.calcDistance(this.getApexB()) )
			 * (p - this.apexB.calcDistance(this.getApexC()) ) * (p-this.apexC.calcDistance(this.getApexA()) ) );
}

}
