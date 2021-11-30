package algorism.CodeUp;

import java.util.Scanner;

public class CodeUp_1023 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double f = scanner.nextDouble();
		String sf = Double.toString(f);
		String [] st = sf.split("[.]"); 
		System.out.printf("%s\n",st[0]);
		System.out.printf("%s\n",st[1]);
	}
}
