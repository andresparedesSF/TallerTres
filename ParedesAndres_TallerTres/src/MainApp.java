import processing.core.PApplet;
import processing.core.PImage;

public class MainApp extends PApplet{

	public static void main(String[] args) {
		PApplet.main("MainApp");
	}
	
	Mundo m;
	public PImage fondo;
	
	@Override
	public void settings() {
		size(1200,700);
	}
	
	@Override
	public void setup() {
		m = new Mundo(this);
		fondo = loadImage("../data/Mundo.png");
	}
	
	@Override
	public void draw() {
		image(fondo,0,0);
		m.pintar();
	}

	@Override
	public void keyPressed() {
		m.teclas();
	}
	
	@Override
	public void mousePressed() {
		println(mouseX + "," + mouseY);
		m.teclado();
	}
}
