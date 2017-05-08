import processing.core.PApplet;
import processing.core.PImage;

public class Ashley extends EquipoB{

	private PImage img;
	
	public Ashley(PApplet app, int x, int y, Mundo ref) {
		super(app,x,y,ref);
		img = app.loadImage("../data/Ashley.png");
	}
	
	public void pintar(){
		app.imageMode(app.CENTER);
		app.image(img, pos.x, pos.y);
		app.imageMode(app.CORNER);
	}
}
