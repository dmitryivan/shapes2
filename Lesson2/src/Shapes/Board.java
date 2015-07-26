package Shapes;


public class Board {
	private final int boardSize=4;
	private Shape[] board = new Shape [boardSize];
	
	public Shape getShape(int cell){
		if (cellOutOfRange(cell)) return null;
		if (board[cell]!=null) {
			Shape curShape = board[cell];
			board[cell]=null;
			System.out.println("Shape " + curShape.getShapeName() + "taken from board" );
			return curShape;
		} else {
			System.out.println("The cell " + cell + " is empty" );
			return null;
		}
	}
	
	public void setShape (Shape newShape){
		for(int i=0; i<boardSize;i++){
			if (board[i]==null){
				board[i]=newShape;
				System.out.println("New " + newShape.getShapeName() +" placed in cell " + i);
				return;
			} 
		}
		System.out.println("Error! Unable to place " + newShape.getShapeName() +
				". No free cells. Please free at least one cell before placing. Current board's content is:");
		boardList();
	}
	
	public void setShape (Shape newShape, int cell){
		if (cellOutOfRange(cell)) return;
		if (board[cell]==null){
			board[cell]=newShape;
			System.out.println("New " + newShape.getShapeName() +" placed in cell " + cell);
		} else {
			System.out.println("Error! Unable to place " + newShape.getShapeName() + " in cell " + cell +
					". The destination cell isn`t empty. Please free cell before placing. Current cell's content below:");
			infoCell(cell);
		}
	}
	
	public void deleteCell (int cell){
		if (cellOutOfRange(cell)) return;
		if (board[cell]==null){
			System.out.println("Cell " + cell + " is already empty");
		} else {
			board[cell]=null;
			System.out.println("Content of cell " + cell + " erased");
		}
	}
	
	public void infoCell (int cell){
		if (cellOutOfRange(cell)) return;
		if (board[cell]!=null) {
			System.out.println("Shape " + board[cell].getShapeName() + " is in the board's cell " + cell);
		} else {
			System.out.println("The cell " + cell + " is empty" );
		}
	}
	
	public void boardList (){
	    double totalArea = 0;
		for(int i=0; i<boardSize;i++){
			infoCell(i);
			if (board[i]!=null) {
				totalArea += board[i].calcArea();
			}
		}
		System.out.println("Total area of shapes on the board is: "  + totalArea);
	}
	
	private boolean cellOutOfRange(int cell){
		if (cell<0 || cell>=boardSize) {
			System.out.println("Error! Cell number out of range. Please use cell numbers from 0 to " + boardSize);
			return true;
		} else return false;
	}
}
