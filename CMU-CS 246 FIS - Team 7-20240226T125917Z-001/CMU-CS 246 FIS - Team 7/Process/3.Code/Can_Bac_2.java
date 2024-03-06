package linhtinh;

import java.util.Scanner;

public class Can_Bac_2 {
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
		
		if(num >= 0){
			 s = Math.sqrt(num);

		System.out.println("Results: "+ (double)Math.round(s*1000)/1000);
		}
		else if(num < 0) {
			System.out.println("Math Error!!");System.out.println("\n Input again!!");
		}
		
	}
}
https://DESKTOP-LHP9PS5/svn/bai_tap_ca_nhan/https://DESKTOP-LHP9PS5/svn/bai_tap_ca_nhan/https://DESKTOP-LHP9PS5/svn/bai_tap_ca_nhan/