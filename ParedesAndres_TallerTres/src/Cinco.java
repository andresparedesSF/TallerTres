import processing.core.PApplet;
import processing.core.PImage;

public class Cinco extends EquipoA{
	
	private PImage img;
	
	public Cinco(PApplet app, int x, int y, Mundo ref){
		super(app,x,y,ref);
		img = app.loadImage("../data/Cinco.png");
	}
	
	public void pintar(){
		app.imageMode(app.CENTER);
		app.image(img, pos.x, pos.y);
		app.imageMode(app.CORNER);
	}

}
