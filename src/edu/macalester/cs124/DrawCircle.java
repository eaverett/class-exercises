package edu.macalester.cs124;
import acm.graphics.*;
import acm.program.*;
import java.awt.*;

@SuppressWarnings("serial")
public class DrawCircle extends GraphicsProgram{
	public void run(){
		double oneX = getWidth();
		double p = 1;
		double q = 1;
		double pOverq;
		double circWidth;
		while (p<50){
			pOverq = (p/q)*(oneX);
			circWidth = oneX*(1/(q*q));
			add(drawFordCircle(pOverq - (circWidth/2), 0, circWidth, circWidth));
			while (q<50){
			  	q++;
				pOverq = (p/q)*(oneX);
				circWidth = oneX*(1/(q*q));
				add(drawFordCircle(pOverq - (circWidth/2), 0, circWidth, circWidth));
				}
			p++;
			q=1;
		}
		
	}
	
	private GOval drawFordCircle(double xLoc, double yLoc, double w, double h) {
		GOval circle = new GOval(xLoc, yLoc, w, h);
		circle.setColor(Color.black);
		circle.setFilled(true);
		return circle;
	}
	

}
