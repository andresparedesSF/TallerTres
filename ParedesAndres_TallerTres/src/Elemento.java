import processing.core.PApplet;
import processing.core.PVector;

public class Elemento extends Thread{
	
	private PApplet app;
	private int x,y;
	private PVector pos;
	private PVector dir;
	private boolean isAlive;
	
	public Elemento(PApplet app) {
		this.app = app;
		//pos = new PVector(x,y);
		x = (int) app.random(25,app.width);
		y = (int) app.random(25,app.height);
		dir = new PVector(app.random(25,app.width - 25), app.random(25,app.height - 25 ));
	}
	
	public void pintar(){
		app.fill(app.random(0,255),app.random(0,255),app.random(0,255));
		app.ellipse(x,y,20,20);
	}
	
	@Override
	public void run() {
		while(isAlive){
			
  			try {
				Thread.sleep(60);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
  			
  		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
