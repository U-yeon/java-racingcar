package domain;

import java.util.Scanner;

public class CarRacingGame {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
	}
	
	public static String[] scanCarName() {
		System.out.println("������ �ڵ��� �̸��� �Է��ϼ���.(�̸��� ��ǥ(,) �������� ����)");
		String allCarNames = scan.nextLine();
		String carName[] = allCarNames.split(",");
		
		return carName;
	}

}
