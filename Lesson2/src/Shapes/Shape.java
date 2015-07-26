package Shapes;

public abstract class Shape {
protected String shapeName ="Please set current shape's name";
public abstract double calcPerimeter();
public abstract double calcArea();

public String getShapeName() {
	return shapeName;
}
}
