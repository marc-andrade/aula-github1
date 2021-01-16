import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		Scanner tc = new Scanner (System.in);
		double raio, pi, area;
		pi = 3.14159;
		System.out.print("Digite o valor do raio:");
		raio = tc.nextDouble();
		tc.close();
		area = pi * Math.pow(raio, 2);
		System.out.println("Entrada:");
		System.out.println(raio);
		System.out.println("Saída: ");
		Locale.setDefault(Locale.US);
		System.out.printf("A = %.4f", area);
		

	}

}
