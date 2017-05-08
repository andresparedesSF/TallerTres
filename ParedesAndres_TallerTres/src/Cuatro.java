import processing.core.PApplet;
import processing.core.PImage;

public class Cuatro extends EquipoA{

	private PImage img;
	
	public Cuatro(PApplet app, int x, int y, Mundo ref) {
		super(app,x,y,ref);
		img = app.loadImage("../data/Cuatro.png");
	}
	
	public void pintar(){
		app.imageMode(app.CENTER);
		app.image(img, pos.x, pos.y);
		app.imageMode(app.CORNER);
	}
}
