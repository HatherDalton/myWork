package AP_Review;

import java.lang.reflect.Array;

public class AlterImage {

	private int max;
	private int min;
	private Array [] red;
	private Array [] green;
	private Array [] blue;
	
	public void generatePixelArray(Array[] xRed, Array[] xBlue, Array[] xGreen ) {
		max=225;
		min=0;
		red= xRed;
		blue=xBlue;
		green =xGreen;
	}
	/**
	public Array getSolution() {
		return ;
	}
	//public Pixel[] generatePixelArray(int [][] green, int [][] blue, int [][]red) {
		
	}**/
}
