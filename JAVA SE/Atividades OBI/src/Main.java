import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
    	Scanner scan = new Scanner(System.in);
		double raio = scan.nextDouble();
		double area = 3.14159 * Math.pow(raio, 2);

		System.out.format(Locale.ENGLISH, "A=%.4f\n", area);
 
    }
 
}

/*
 * ====== 1001
 * 
 * Scanner scan = new Scanner(System.in); int A, B, X; A = scan.nextInt(); B =
 * scan.nextInt(); X = A + B; System.out.printf("X = %d\n",X);
 */