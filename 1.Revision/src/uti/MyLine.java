package uti;

public class MyLine {
	private MyPoint begin;
	private MyPoint end;
	
	public MyLine() {
		
	}
	
	public MyLine( MyPoint begin, MyPoint end ) {
		this.begin = begin;
		this.end = end;
	}
	
	public MyLine( int beginX, int beginY, int endX, int endY ) {
		this.begin = new MyPoint(beginX, beginY);
		this.end = new MyPoint(endX, endY);
	}
	
	public MyPoint getBegin() {
		return begin;
	}
	public void setBegin(MyPoint begin) {
		this.begin = begin;
	}
	public MyPoint getEnd() {
		return end;
	}
	public void setEnd(MyPoint end) {
		this.end = end;
	}
	
	public int getBeginX() {
		return begin.getX();
	}
	
	public int getBeginY() {
		return begin.getY();
	}
	
	public int getEndX() {
		return end.getX();
	}
	
	public int getEndY() {
		return end.getY();
	}
	
	public void setBeginX( int x ) {
		begin.setX(x);
	}
	
	public void setBeginY( int y ) {
		begin.setY( y );
	}
	
	public void setEndX(int x) {
		end.setX(x);
	}
	
	public void setEndY(int y) {
		end.setY(y);
	}
	
	public int[] getBeginXY() {
		int []xy = new int[2];
		xy[0] = begin.getX();
		xy[1] = begin.getY();
		return xy;
	}
	
	public void setEndXY(int x, int y) {
		if( end == null ) {
			System.out.println("Setting values of uninitialized reference");
			return;
		}
		
		end.setX(x);
		end.setY(y);
	}
	
	public double getLength() {
		System.out.println(Math.pow(getBeginX() - getEndX(), 2));
		System.out.println( Math.pow(getBeginY() - getEndY(), 2));
		return Math.sqrt(Math.pow(getBeginX() - getEndX(), 2) + Math.pow(getBeginY() - getEndY(), 2));
	}
	
	public double getGradient() {
		return Math.atan2(Math.abs(getBeginY() - getEndY()), Math.abs(getBeginX() - getEndX()));
	}
	
	public String toString() {
		return "My line [begin: " + begin.getX() + ", " + begin.getY() + "; end: " + end.getX() + ", " + end.getY() + " ];";
	}
}
