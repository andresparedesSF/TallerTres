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
		pos = new PVector(x,y);
		dir = new PVector(app.random(5,10),app.random(5,10));
	}
	
	public abstract void pintar();
	
	public void mover(){
	    pos.add(dir);
	    
	    if(pos.x>app.width-25){
	      dir.x*=-1;
	    }
	    if(pos.x<25){
	      dir.x*=-1;
	    }
	     if(pos.y>app.height-25){
	      dir.y*=-1;
	    }
	    if(pos.y<25){
	      dir.y*=-1;
	    }
	}

}
