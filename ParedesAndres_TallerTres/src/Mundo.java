import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class Mundo {

	private PApplet app;
	private ArrayList<EquipoA> equiA = new ArrayList<EquipoA>();
	private ArrayList<EquipoB> equiB = new ArrayList<EquipoB>();
	private ArrayList<Elemento> ele = new ArrayList<Elemento>();
	private boolean agregar = true;
	private PImage fondo;
	private boolean agregar2 = true;
	private int pantalla;

	public Mundo(PApplet app) {
		this.app = app;
		pantalla = 0;
		fondo = app.loadImage("../data/Fondo.png");
		equiA.add(new Uno(app, 147, 235, this));
		equiA.add(new Cuatro(app, 147, 335, this));
		equiA.add(new Cinco(app, 147, 435, this));
		for (int i = 0; i < equiA.size(); i++) {
			EquipoA p = equiA.get(i);
			p.start();
		}

		equiB.add(new Ashley(app, 900, 235, this));
		equiB.add(new Bruce(app, 900, 235, this));
		equiB.add(new Lenny(app, 900, 235, this));
		for (int i = 0; i < equiB.size(); i++) {
			EquipoB p = equiB.get(i);
			p.start();
		}

		for (int i = 0; i < 10; i++) {
			ele.add(new Elemento(app));
			// Elemento e = ele.get(i);
			// e.start();
		}
	}

	public void pintar() {
		
		switch(pantalla){
		
			case 0:
				app.image(fondo, 0, 0);
			break;
		
			
			case 1:
				for (int i = 0; i < equiA.size(); i++) {
					EquipoA p = equiA.get(i);
					p.pintar();
				}

				for (int i = 0; i < equiB.size(); i++) {
					EquipoB p = equiB.get(i);
					p.pintar();
				}

				for (int i = 0; i < ele.size(); i++) {
					Elemento e = ele.get(i);
					e.pintar();
				}
			break;
		}
		
		destruir();
		
	}

	public void teclas(){
		if(app.keyCode == app.ENTER){
			pantalla = 1;
		}
	}
	
	public void teclado() {

		if (app.mouseX > 581 && app.mouseX < 621 && app.mouseY > 603 && app.mouseY < 640) {
			System.out.println("estoy dentro de Uno");
			for (int i = 0; i < equiA.size(); i++) {
				equiA.get(i).setAlive(false);
				System.out.println(equiA.get(i).isAlive);
			}

			//muere hilo
			for (int i = 0; i < equiB.size(); i++) {
				equiB.get(i).setAlive(false);
				//System.out.println(equiB.get(i).getState());
				
			}
			equiA.clear();
			equiB.clear();
//			for (int i = 0; i < equiA.size(); i++) {
//				
//			}

		}

		if (app.mouseX > 95 && app.mouseX < 178 && app.mouseY > 634 && app.mouseY < 687) {
			System.out.println("estoy dentro de Uno");
			if (agregar) {
				EquipoA p = new Uno(app, 147, 235, this);
				p.start();
				equiA.add(p);
				// agregar = false;
				// equiA.add(new Uno(app,147,235,this));
			}
		}

		if (app.mouseX > 192 && app.mouseX < 248 && app.mouseY > 637 && app.mouseY < 687) {
			System.out.println("estoy dentro de Cuatro");
			if (agregar) {
				EquipoA p = new Cuatro(app, 147, 335, this);
				p.start();
				equiA.add(p);
				// agregar2 = false;
				// equiA.add(new Uno(app,147,235,this));
			}
		}

		if (app.mouseX > 261 && app.mouseX < 331 && app.mouseY > 636 && app.mouseY < 688) {
			System.out.println("estoy dentro de Cinco");
			if (agregar) {
				EquipoA p = new Cinco(app, 147, 435, this);
				p.start();
				equiA.add(p);
				// agregar2 = false;
				// equiA.add(new Uno(app,147,235,this));
			}
		}

		if (app.mouseX > 849 && app.mouseX < 925 && app.mouseY > 634 && app.mouseY < 688) {
			System.out.println("estoy dentro de Cinco");
			if (agregar) {
				EquipoB p = new Ashley(app, 1079, 235, this);
				p.start();
				equiB.add(p);
				// agregar2 = false;
				// equiA.add(new Uno(app,147,235,this));
			}
		}

		if (app.mouseX > 940 && app.mouseX < 1000 && app.mouseY > 634 && app.mouseY < 688) {
			System.out.println("estoy dentro de Cinco");
			if (agregar) {
				EquipoB p = new Lenny(app, 1079, 235, this);
				p.start();
				equiB.add(p);
				// agregar2 = false;
				// equiA.add(new Uno(app,147,235,this));
			}
		}

		if (app.mouseX > 1020 && app.mouseX < 1090 && app.mouseY > 634 && app.mouseY < 688) {
			System.out.println("estoy dentro de Cinco");
			if (agregar) {
				EquipoB p = new Bruce(app, 1079, 235, this);
				p.start();
				equiB.add(p);
				// agregar2 = false;
				// equiA.add(new Uno(app,147,235,this));
			}
		}

	}

	public void destruir() {
		for (int i = 0; i < equiA.size(); i++) {

			EquipoA a = equiA.get(i);
			for (int j = 0; j < equiB.size(); j++) {
				EquipoB b = equiB.get(j);

				if (app.dist(a.getX(), a.getY(), b.getX(), b.getY()) < 100) {
					System.out.println("ala");
					if (a.getVida() < b.getVida()) {
						equiA.remove(a);
					} else if (a.getVida() > b.getVida()) {
						equiB.remove(b);
					}

				}

			}

		}

	}

	public ArrayList<EquipoA> getEquiA() {
		return equiA;
	}

	public void setEquiA(ArrayList<EquipoA> equiA) {
		this.equiA = equiA;
	}

	public ArrayList<EquipoB> getEquiB() {
		return equiB;
	}

	public void setEquiB(ArrayList<EquipoB> equiB) {
		this.equiB = equiB;
	}

	public ArrayList<Elemento> getEle() {
		return ele;
	}

	public void setEle(ArrayList<Elemento> ele) {
		this.ele = ele;
	}

}
