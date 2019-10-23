package FormasGeometricas;

public class Trapezio implements AreaCalculavel {
	private int baseMenor;
	private int baseMaior;
	private int altura;
	
	//getters and setters
	public int getBaseMenor() {
		return baseMenor;
	}
	public int getBaseMaior() {
		return baseMaior;
	}
	public int getAltura() {
		return altura;
	}
	public void setBaseMenor(int baseMenor) {
		this.baseMenor = baseMenor;
	}
	public void setBaseMaior(int baseMaior) {
		this.baseMaior = baseMaior;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	//costrutor
	public Trapezio(int baseMenor, int baseMaior, int altura) {
		this.baseMenor = baseMenor;
		this.baseMaior = baseMaior;
		this.altura = altura;
	}
	

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return ((baseMenor + baseMaior)*altura)/2;
	}

}
