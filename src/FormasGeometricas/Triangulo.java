package FormasGeometricas;

public class Triangulo implements AreaCalculavel {
	private int lado1;
	private int lado2;
	private int ladoBase;
	private double altura;
	private double p;
	
	//getters and setters
	public int getLado1() {
		return lado1;
	}
	public int getLado2() {
		return lado2;
	}
	public int getLadoBase() {
		return ladoBase;
	}
	public double getAltura() {
		return altura;
	}
	public double getP() {
		return p;
	}
	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}
	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}
	public void setLado3(int ladoBase) {
		this.ladoBase = ladoBase;
	}
	
	//construtor
	public Triangulo(int lado1, int lado2, int lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.ladoBase = lado3;
	}
	public boolean existe() {
		if(Math.abs(lado1 - lado2) < ladoBase & ladoBase < lado1 + lado2) {
			return true;
		}
		return false;
	}
	public void calculaAltura() {
		p = (this.lado1 + this.lado2 + this.ladoBase)/2;
		double temp = Math.sqrt(p*(p-lado1)*(p-lado2)*(p-ladoBase));
		altura = (2*temp)/ladoBase;		
	}	

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return (ladoBase * altura)/2;
	}

}
