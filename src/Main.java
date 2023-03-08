import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		System.out.println("Як вас звати?");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String username = input.readLine();
		System.out.println("Привіт, " + username + "!");

		int now = 2023;
		System.out.println("Скільки вам років?");
		int age = Integer.parseInt(input.readLine());
		System.out.println("Ви народилися в " + (now - age) + " році.");
		float a = 0, b = 0;
		while (a == 0 || b == 0) {
			System.out.println("Введіть ненульове a:");
			a = Float.parseFloat(input.readLine());
			System.out.println("Введітьне нульове b:");
			b = Float.parseFloat(input.readLine());
			if (a == 0 || b == 0) {
				System.out.println("Ви ввели помилкові дані!!!");
			}
		}

		a = (float) Math.pow(a, 2);
		b = (float) Math.pow(b, 2);

		System.out.println("a^2 + b^2 = " + (a + b) + "\na^2 - b^2 = " + (a - b) + "\na^2 * b^2 = " + (a * b) + "\na^2 / b^2 = " + (a / b) + "\n");
	}
}