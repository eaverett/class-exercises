package edu.macalester.cs124;
import acm.graphics.*;
import acm.program.*;
import java.awt.*;

@SuppressWarnings("serial")
public class DrawCircle extends GraphicsProgram{
	public void run(){
		double oneX = getWidth();
		//double oneY = getHeight();
		double pOverq = (p/q)*(oneX);
		double circWidth = oneX*(1/(q*q));
		add(drawFordCircle(pOverq - (circWidth/2), 0, circWidth, circWidth));
	}
	
	private GOval drawFordCircle(double xLoc, double yLoc, double w, double h) {
		GOval circle = new GOval(xLoc, yLoc, w, h);
		circle.setColor(Color.black);
		circle.setFilled(true);
		return circle;
	}
	
	private static final double p = 1;
	private static final double q = 3;
}
