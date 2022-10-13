package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.filledRectangle(0.5, 0.5, 0.1, 0.2);
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.filledRectangle(0.3, 0.5, 0.1, 0.2);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.filledRectangle(0.7, 0.5, 0.1, 0.2);
		StdDraw.setPenColor(StdDraw.CYAN);
		StdDraw.filledCircle(.5, .5, .07);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.setPenRadius(0.03);
		StdDraw.rectangle(0.5, 0.5, 0.3, 0.2);
	}
}