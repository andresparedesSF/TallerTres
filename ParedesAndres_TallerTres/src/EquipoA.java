import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PVector;

public abstract class EquipoA extends Thread{
	
	protected PApplet app;
	protected int x,y;
	protected int contador;
	protected PVector pos;
	protected PVector dir;
	protected Mundo ref;
	protected boolean isAlive;
	
	public EquipoA(PApplet app, int x, int y, Mundo ref) {
		this.app = app;
		this.x = x;
		this.y = y;
		this.ref = ref;
		isAlive = true;
		pos = new PVector(x,y);
		dir = new PVector(app.random(1,3),app.random(1,3));
		contador = 0;
	}
	
	public abstract void pintar();
	
	@Override
	public void run() {
		while(isAlive){
  			
  			//tocarObstaculo();
			mover();
			//nivelPoder();
  			
  			
  			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
  			
  		}
	}
	

	
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
