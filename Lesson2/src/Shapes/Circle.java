package Shapes;

public class Circle extends Shape{
private Point center;
private Point radius;


public Circle(Point center, Point radius) {
	super();
	this.center = center;
	this.radius = radius;
	this.shapeName="Circle";
}

public Point getCenter() {
	return center;
}
public void setCenter(Point center) {
	this.center = center;
}
public Point getRadius() {
	return radius;
}
public void setRadius(Point radius) {
	this.radius = radius;
}
@Override
public double calcPerimeter() {
	return  2*Math.PI *center.calcDistance(radius);
}
@Override
public double calcArea() {
	return  Math.PI * (center.calcDistance(radius) / 2) * (center.calcDistance(radius) / 2) ;
}

}
