import processing.core.PApplet;
import processing.core.PImage;

public class Uno extends Personaje{
	
	private PImage img; 

	public Uno(PApplet app, int x, int y, Mundo ref) {
		super(app,x,y,ref);
		img = app.loadImage("../data/Uno.png");
	}
	
	public void pintar(){
		app.imageMode(app.CENTER);
		app.image(img, x, y);
		app.imageMode(app.CORNER);
	}
	
}
