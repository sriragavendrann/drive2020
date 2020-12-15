package zoho;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=scan.nextInt();
		for(int i=0;i<=num;i++) {
			int temp=i;
			for(int j=0;j<=num*2;j++) {
				if(j<num-i ||j>num+i) {
					System.out.print(" ");
				}
				else if(j<num) {
					System.out.print(temp--);
				}
				else {
					System.out.print(temp++);
				}
			}
			System.out.println();
	}
}
}