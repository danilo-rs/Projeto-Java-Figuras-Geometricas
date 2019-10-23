package FormasGeometricas;

public class Retangulo implements AreaCalculavel {
	
	private int largura;
	private int altura;
	
	//getters and setters
	public int getLargura() {
		return largura;
	}
	public int getAltura() {
		return altura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	//cosntrutor
	public Retangulo(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
	}

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return this.largura * this.altura;
	}

}
