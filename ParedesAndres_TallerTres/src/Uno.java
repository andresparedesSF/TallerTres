import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class Uno extends EquipoA{
	
	private PImage img;
	boolean isAlive = true;

	public Uno(PApplet app, int x, int y, Mundo ref) {
		super(app,x,y,ref);
		img = app.loadImage("../data/Uno.png");
	}
	
	public void pintar(){
		app.imageMode(app.CENTER);
		app.image(img, pos.x, pos.y);
		app.imageMode(app.CORNER);
	}
	
	

	

	
}
