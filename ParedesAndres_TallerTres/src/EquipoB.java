import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PVector;

public abstract class EquipoB extends Thread{
	
	protected PApplet app;
	protected int x,y;
	protected PVector pos;
	protected PVector dir;
	protected Mundo ref;
	protected boolean isAlive;
	int vida;
	
	public EquipoB(PApplet app, int x, int y, Mundo ref) {
		this.app = app;
		this.x = x;
		this.y = y;
		this.ref = ref;
		isAlive = true;
		pos = new PVector(x,y);
		dir = new PVector(app.random(1,3),app.random(1,3));
	}
	
	public abstract void pintar();
	
	public void nivelPoder(){
		ArrayList<Elemento> ele = ref.getEle();
		ArrayList<EquipoB> equi = ref.getEquiB();
		
		for(int j = 0; j < ele.size();j++){
			Elemento e = ele.get(j);
			for (int i = 0; i < equi.size(); i++) {
				EquipoB a = equi.get(i);
				float distancia = app.dist(pos.x, pos.y, e.getX(), e.getY());
				if(distancia<60){
					ele.remove(e);
					vida++;
					//System.out.println("toque elemento");
				}
			}
		}
		
	}
	
	
	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public PVector getPos() {
		return pos;
	}

	public void setPos(PVector pos) {
		this.pos = pos;
	}

	public PVector getDir() {
		return dir;
	}

	public void setDir(PVector dir) {
		this.dir = dir;
	}

	public Mundo getRef() {
		return ref;
	}

	public void setRef(Mundo ref) {
		this.ref = ref;
	}

	

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getX() {
		return (int) pos.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return (int) pos.y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public void run() {
		while(isAlive){
  			
  			//tocarObstaculo();
  			mover();
  			nivelPoder();
  			
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
