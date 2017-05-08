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
	protected int vida;
	protected boolean isAlive=true;
	
	public EquipoA(PApplet app, int x, int y, Mundo ref) {
		this.app = app;
		this.x = x;
		this.y = y;
		this.ref = ref;
		pos = new PVector(x,y);
		dir = new PVector(app.random(1,3),app.random(1,3));
		contador = 0;
	}
	
	public abstract void pintar();
	
	public void nivelPoder(){
		ArrayList<Elemento> ele = ref.getEle();
		ArrayList<EquipoA> equi = ref.getEquiA();
		
		for(int j = 0; j < ele.size();j++){
			Elemento e = ele.get(j);
			for (int i = 0; i < equi.size(); i++) {
				EquipoA a = equi.get(i);
				float distancia = app.dist(pos.x, pos.y, e.getX(), e.getY());
				if(distancia<60){
					ele.remove(e);
					vida++;
					//System.out.println("toque elemento");
				}
			}
		}
		
	}
	
	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	@Override
	public void run() {
		while(isAlive){
  			
  			//tocarObstaculo();
			mover();
			//nivelPoder();
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

	public boolean isIsAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	
}
