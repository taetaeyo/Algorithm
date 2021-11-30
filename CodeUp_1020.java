package algorism.CodeUp;

import java.util.Scanner;

public class CodeUp_1020 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String jumin = scanner.next();
		String [] juArr = jumin.split("-");
		
		for (String s : juArr) {
			System.out.print(s);
		}
	}

}
