import processing.core.PApplet;
import processing.core.PVector;

public abstract class Personaje {
	
	protected PApplet app;
	protected int x,y;
	protected PVector pos;
	protected PVector dir;
	protected Mundo ref;
	
	public Personaje(PApplet app, int x, int y, Mundo ref) {
		this.app = app;
		this.x = x;
		this.y = y;
		this.ref = ref;
	}
	
	public abstract void pintar();
	
	public void mover(){
		
	}

}
