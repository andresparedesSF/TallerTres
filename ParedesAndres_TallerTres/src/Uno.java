import processing.core.PApplet;
import processing.core.PImage;

public class Uno extends Personaje implements Runnable{
	
	private PImage img;
	boolean isAlive = true;

	public Uno(PApplet app, int x, int y, Mundo ref) {
		super(app,x,y,ref);
		img = app.loadImage("../data/Uno.png");
	}
	
	
	
	@Override
	public void run() {
		while(isAlive){
			int i=0;
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}		
	}



	public void pintar(){
		app.imageMode(app.CENTER);
		app.image(img, pos.x, pos.y);
		app.imageMode(app.CORNER);
	}
	
}
