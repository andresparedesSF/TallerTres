import processing.core.PApplet;
import processing.core.PImage;

public class Lenny extends EquipoB{

	private PImage img;
	
	public Lenny(PApplet app, int x, int y, Mundo ref) {
		super(app,x,y,ref);
		img = app.loadImage("../data/Lenny.png");
	}
	
	public void pintar(){
		app.imageMode(app.CENTER);
		app.image(img, pos.x, pos.y);
		app.imageMode(app.CORNER);
	}
}
