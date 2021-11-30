package algorism.CodeUp;

import java.util.Scanner;

public class CodeUp_1024 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		for (int i = 0; i < s.length(); i++) {
			System.out.println("'" + s.charAt(i) +"'");
		}
	}
}
