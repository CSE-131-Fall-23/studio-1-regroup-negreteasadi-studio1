package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Write Year");
		int n1 = in.nextInt();
		boolean isLeapYear = ((n1 % 4 ==0&&n1 % 100 !=0)||n1 % 400 ==0);
		System.out.println(isLeapYear);
		// TODO Auto-generated method stub

	}

}
