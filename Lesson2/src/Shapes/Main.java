package Shapes;

public class Main {

	public static void main(String[] args) {
		Point p1=new Point(1,2);
		
		Point p2=new Point(3,4);
		Point p3=new Point(5,6);
		Point p4=new Point(7,6);
		Circle c1=new Circle(p3,p2);
		
		Circle c2=new Circle(p3,p2);
		Triangle t1 = new Triangle (p2, p3, p4);
		Board b = new Board();
		b.boardList();
		b.setShape(c1);
		b.setShape(c2, 1);
		b.setShape(t1, 3);
		b.boardList();
	}

}
