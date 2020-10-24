import java.util.Scanner;

public class ExercicoLogica4 {

	public static void main(String[] args) {
		double a, b, c, delta, x1, x2;
		Scanner le = new Scanner(System.in);

		System.out.println("Digite valores: A B C: ");
		a = le.nextDouble();
		b = le.nextDouble();
		c = le.nextDouble();

		delta = Math.pow(b, 2) - 4 * a * c;

		if (delta < 0) {
			System.out.println("Erro! sem raizes");
		}else {
			x1 = (-b + Math.sqrt(delta)) / 2 * a;
			x2 = (-b - Math.sqrt(delta)) / 2 * a;

			System.out.println("Delta eh :" + delta);
			System.out.println("Valor x1: " + x1);
			System.out.println("Valor x2: " + x2);

			le.close();
		}
			
	}

}
