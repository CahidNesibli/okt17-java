package okt17Java1;

import java.util.Scanner;

public class DersPraktikasi2 {
	public static void main(String[] args) {

		// 1
		System.out.println("1) 1-5 arasındakı ədədlər:");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}

		// 2

		Scanner scaan = new Scanner(System.in);

		System.out.print("\n2) Birinci ədədi daxil et: ");
		int a = scaan.nextInt();

		System.out.print("İkinci ədədi daxil et: ");
		int b = scaan.nextInt();

		int cem = a + b;
		System.out.println("Cəm = " + cem);

		// 3
		int hasil = a * b;
		System.out.println("Hasil = " + hasil);

		// 4
		System.out.print("\n4) Radiusu daxil et: ");
		double r = scaan.nextDouble();

		double uzunluq = 2 * Math.PI * r;
		System.out.println("Çevrənin uzunluğu = " + uzunluq);

	}
}
