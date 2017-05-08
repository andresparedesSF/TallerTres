import java.util.ArrayList;

import processing.core.PApplet;

public class Mundo {
	
	private PApplet app;
	private ArrayList<EquipoA> equiA = new ArrayList<EquipoA>();
	private ArrayList<EquipoB> equiB = new ArrayList<EquipoB>();
	private boolean agregar =  true;
	private boolean agregar2 = true;
	private Uno u;
	
	public Mundo(PApplet app) {
		this.app = app;
		equiA.add(new Uno(app,147,235,this));
		equiA.add(new Cuatro(app,147,335,this));
		equiA.add(new Cinco(app,147,435,this));
		for (int i = 0; i < equiA.size(); i++) {
			EquipoA p = equiA.get(i);
			p.start();
		}
		
		equiB.add(new Ashley(app,900,235,this));
		equiB.add(new Bruce(app,900,235,this));
		equiB.add(new Lenny(app,900,235,this));
		for (int i = 0; i < equiB.size(); i++) {
			EquipoB p = equiB.get(i);
			p.start();
		}
	}
	
	public void pintar(){
		for (int i = 0; i < equiA.size(); i++) {
			EquipoA p = equiA.get(i);
			p.pintar();
		}
		
		for (int i = 0; i < equiB.size(); i++) {
			EquipoB p = equiB.get(i);
			p.pintar();
		}
	}
	
	public void teclado(){
		
		if(app.mouseX>95 &&app.mouseX<178 && app.mouseY > 634 && app.mouseY <687){
			System.out.println("estoy dentro de Uno");
				if(agregar){
					EquipoA p = new Uno(app,147,235,this);
				    p.start();
				    equiA.add(p);
				    //agregar = false;
					//equiA.add(new Uno(app,147,235,this));
				}
		}
		
		if(app.mouseX>192 &&app.mouseX<248 && app.mouseY > 637 && app.mouseY <687){
			System.out.println("estoy dentro de Cuatro");
				if(agregar){
					EquipoA p = new Cuatro(app,147,235,this);
				    p.start();
				    equiA.add(p);
				    //agregar2 = false;
					//equiA.add(new Uno(app,147,235,this));
				}
		}
		
	}
	

}
