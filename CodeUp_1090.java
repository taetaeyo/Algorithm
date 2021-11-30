package algorism.CodeUp;

import java.util.Scanner;

public class CodeUp_1090 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] pan = new int[20][20];
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			pan[x][y] = 1;
		}
		
		for (int i = 1; i < pan.length; i++) {
			for (int j = 1; j < pan[i].length; j++) {
				System.out.printf("%d ",pan[i][j]);
			}
			System.out.println();
		}
	} //main
}
