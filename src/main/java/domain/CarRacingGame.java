package domain;

import java.util.Scanner;

public class CarRacingGame {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		String carName[] = scanCarName();
		Car.carNum = carName.length;
		Car cars[] = new Car[Car.carNum];
		
		for (int i=0; i<Car.carNum; ++i) {
			cars[i] = new Car(carName[i]);
		}
	}
	
	public static String[] scanCarName() {
		System.out.println("������ �ڵ��� �̸��� �Է��ϼ���.(�̸��� ��ǥ(,) �������� ����)");
		String allCarNames = scan.nextLine();
		String carName[] = allCarNames.split(",");
		
		while (!isValidtext(carName)) {
			System.out.println("�ڵ����� �̸��� 5���� ���Ͽ����մϴ�. �ٽ� �Է��ϼ���.");
			allCarNames = scan.nextLine();
			carName = allCarNames.split(",");
		}
		
		return carName;
	}

	public static boolean isValidtext(String[] carName) {
		for (int i=0; i<carName.length; ++i) {
			if(carName[i].length()>5) {
				return false;
			}
		}
		return true;
	}
}
