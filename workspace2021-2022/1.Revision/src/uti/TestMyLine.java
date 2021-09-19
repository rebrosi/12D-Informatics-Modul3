package uti;

public class TestMyLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLine line = new MyLine(1, 2, 30, 40);
			int[] xy = line.getBeginXY();
			System.out.println(line.getLength());
			System.out.println(line.toString());
			System.out.println(xy[1]);
			
			MyLine line2 = new MyLine();
			line2.setEndXY(1, 2);
	}

}
