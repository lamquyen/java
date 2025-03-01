package hocjava;

import java.security.interfaces.XECPublicKey;
import java.util.Scanner;

public class baitap1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		System.out.println("bạn tên là:");
//		String name = scanner.nextLine();
//		System.out.println("diem so:");
//		int grace = scanner.nextInt();
//		System.out.println("thong tin:" + name + grace);
		
		System.out.println("nhap chieu dai");
		int chieudai=scanner.nextInt();
		System.out.println("nhap chieu rong");
		int chieurong=scanner.nextInt();
		int s=chieudai * chieurong;
		System.out.println("dien tich hinh chu nhat la"+ s);
	}
}
