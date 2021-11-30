package algorism.CodeUp;

import java.util.Scanner;

public class CodeUp_1026 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String time = sc.next();
		if ( time.length() == 7 ) {
			if( time.substring(2, 4).equals("00") ) {
				System.out.println( time.substring(3, 4) );
			}else {
				System.out.println( time.substring(2, 4) );
			}
		} else {
			
			System.out.println( time.substring(3, 5) );
		}
		
	}
}
