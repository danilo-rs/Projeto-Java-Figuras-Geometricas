package FormasGeometricas;

public class Quadrado implements AreaCalculavel {
	
	private int lado;
	
	//getter and setters
	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}
	
	//construtor
	public Quadrado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calculaArea() {		
		return this.lado*this.lado;
	}

}
