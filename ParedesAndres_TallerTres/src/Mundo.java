import java.util.ArrayList;

import processing.core.PApplet;

public class Mundo {
	
	private PApplet app;
	private ArrayList<Personaje> per = new ArrayList<Personaje>();
	private Uno u;
	
	public Mundo(PApplet app) {
		this.app = app;
		u = new Uno(app,100,100,this);
		per.add(new Uno(app,200,100,this));
		per.add(new Cuatro(app,300,100,this));
//		for(int i = 0; i < 5; i++){
//			per.add(new Uno(app,(i*100) + 100,100,this));
//		}
	}
	
	public void pintar(){

		for (int i = 0; i < per.size(); i++) {
			Personaje p = per.get(i);
			p.pintar();
		}
	}
	
	public void mover(){
		for (int i = 0; i < per.size(); i++) {
			Personaje p = per.get(i);
			p.mover();
		}
	}
	
	public ArrayList<Personaje> getPer() {
		return per;
	}

	public void setPer(ArrayList<Personaje> per) {
		this.per = per;
	}

	

}
