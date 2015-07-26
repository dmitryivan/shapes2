package Shapes;

public class Point extends Shape {

private double x;
private double y;

public Point(double x, double y) {
	super();
	this.x = x;
	this.y = y;
	this.shapeName="Point";
}

public double getX() {
	return x;
}
public void setX(double x) {
	this.x = x;
}
public double getY() {
	return y;
}
public void setY(double y) {
	this.y = y;
}

public double calcDistance(Point b){
	return Math.sqrt((this.getX()-b.getX())*(this.getX()-b.getX())+(this.getY()-b.getY())*(this.getY()-b.getY()));
}

@Override
public double calcPerimeter() {
	return  0;
}
@Override
public double calcArea() {
	return 0;
}

}
