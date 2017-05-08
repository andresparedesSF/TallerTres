import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class Uno extends EquipoA{
	
	private PImage img;
	boolean isAlive = true;

	public Uno(PApplet app, int x, int y, Mundo ref) {
		super(app,x,y,ref);
		img = app.loadImage("../data/Uno.png");
	}
	
	public void pintar(){
		app.imageMode(app.CENTER);
		app.image(img, pos.x, pos.y);
		app.imageMode(app.CORNER);
	}
	
	
	public void nivelPoder(){
		ArrayList<Elemento> ele = ref.getEle();
		ArrayList<EquipoA> equi = ref.getEquiA();
		
		for(int j = 0; j < ele.size();j++){
			for (int i = 0; i < equi.size(); i++) {
				Elemento e = ele.get(j);
				EquipoA a = equi.get(i);
				if(app.dist(a.x, a.y, e.getX(), e.getY())<60){
					System.out.println("toque elemento");
				}
			}
		}
		
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
	
}
