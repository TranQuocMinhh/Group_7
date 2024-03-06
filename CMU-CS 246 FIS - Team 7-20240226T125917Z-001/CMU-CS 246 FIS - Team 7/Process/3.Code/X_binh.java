package linhtinh;

import java.util.Scanner;

public class X_binh {
	public static void main(String[] args) {
		double num;
		double s = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("input number:");
		while(!sc.hasNextDouble()) {
			System.out.println("\n Input again!!");
            sc.next();
		}
		num = sc.nextDouble();
		if(num == 0) {
			s = 0;
		}
		else {
			s = num * num;
		}
		System.out.println("Result:" + "%0.3f"+s);
	}
}
