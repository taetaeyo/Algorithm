package algorism.CodeUp;

import java.util.Scanner;

public class CodeUp_1019 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String year = scanner.next();
		String [] yArr = year.split("[.]");
		
		System.out.printf("%04d.%02d.%02d",Integer.parseInt(yArr[0])  
										,Integer.parseInt(yArr[1])
										,Integer.parseInt(yArr[2]));
	}

}
