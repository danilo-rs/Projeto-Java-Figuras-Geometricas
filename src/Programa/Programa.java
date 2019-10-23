package Programa;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import FormasGeometricas.*;

public class Programa {

	public static void main(String[] args) throws IOException {
		//uso da classe scanner para inserir os valores
		Scanner inputData = new Scanner(System.in);
		int n1;
		int n2;
		int n3;
		char menu, fim;
		//Menu para escolher que tipo de formas geométricas deseja calcular  área
		for(;;) {
			do {
		System.out.println("Escolha abaixo que tipo de área deseja calcular:");
		System.out.println("1 - Calcular área de um circulo");
		System.out.println("2 - Calcular área de um quadrado");
		System.out.println("3 - Calcular área de um retângulo");
		System.out.println("4 - Calcular área de um trapézio");
		System.out.println("5 - Calcular área de um triangulo");
		System.out.println("Pressione q para encerrar.");
		menu = (char) System.in.read();
		do {
			fim = (char) System.in.read();			
		}while(fim != '\n');
			}while(menu <'1'|menu>'7' & menu != 'q');

			if(menu == 'q') {
				System.out.println("O Programa foi encerrado!");
				break;
			}
			System.out.print("\n");
			
		
		//usar um switch case para informar os valores  e calcular área
		switch(menu) {
		case '1':
			try {
			System.out.println("Insira o valor do raio do círculo: ");
			n1 = inputData.nextInt();			
			AreaCalculavel c = new Circulo(n1);
			System.out.print("\n");
			System.out.println("A área do circulo é: "+c.calculaArea());
			System.out.print("\n");
			System.out.println("---------------------------------------------------------------");
			}catch (InputMismatchException erro1) {
				System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
				inputData.nextLine();
			}
			break;
		case '2':
			try {
			System.out.println("Insira o valor do lado do quadrado: ");
			n1 = inputData.nextInt();
			AreaCalculavel q = new Quadrado(n1);
			System.out.println("A área do quadrado é: "+q.calculaArea());
			System.out.print("\n");
			System.out.println("---------------------------------------------------------------");
			}catch (InputMismatchException erro1) {
				System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
				inputData.nextLine();
			}
			break;
		case '3':
			try {
			System.out.println("Insira um lado do Retângulo: ");
			n1 = inputData.nextInt();
			System.out.println("Insira outro lado do Retângulo: ");
			n2 = inputData.nextInt();
			AreaCalculavel r = new Retangulo(n1,n2);
			System.out.println("A área do retângulo é: "+r.calculaArea());
			System.out.print("\n");
			System.out.println("---------------------------------------------------------------");
			}catch (InputMismatchException erro1) {
				System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
				inputData.nextLine();
			}
			break;
		case '4':
			try {
			System.out.println("Insira a base menor do trapézio: ");
			n1 = inputData.nextInt();
			System.out.println("Insira a base maior do trapézio: ");
			n2 = inputData.nextInt();
			System.out.println("Insira a altura do trapézio: ");
			n3 = inputData.nextInt();
			AreaCalculavel tp = new Trapezio(n1, n2, n3);
			System.out.println("A área do trapézio é: "+tp.calculaArea());
			System.out.print("\n");
			System.out.println("---------------------------------------------------------------");
			}catch (InputMismatchException erro1) {
				System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
				inputData.nextLine();
			}
			break;
		case '5':
			try {
			System.out.println("Insira um lado do Triangulo: ");
			n1 = inputData.nextInt();
			System.out.println("Insira outro lado do Triangulo: ");
			n2 = inputData.nextInt();
			System.out.println("Insira o lado da base do Triangulo: ");
			n3 = inputData.nextInt();
			Triangulo tr = new Triangulo(n1,n2, n3);
			if( tr.existe() == true) {
				tr.calculaAltura();
				System.out.println("A altura do tringulo é: "+tr.getAltura());
				System.out.println("O triangulo existe e possui uma área de: "+tr.calculaArea());
				System.out.print("\n");
				System.out.println("---------------------------------------------------------------");
				
			}else {
				System.out.println("Não é possível construir um triangulo com os lados informados!");
				System.out.print("\n");
				System.out.println("---------------------------------------------------------------");
			}
			}catch (InputMismatchException erro1) {
				System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
				inputData.nextLine();
			}
			break;
						
		}
		}
		
	}

}
