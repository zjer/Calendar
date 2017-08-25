package calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ݣ�");
		int years = sc.nextInt();
		System.out.print("�����·ݣ�");
		int months = sc.nextInt();
		
		// ����1900�굽��ǰ��ݵ�����
		int sum = 0;
		for (int year = 1900; year < years; year++) {
			if (year % 4 == 0 || year % 100 == 0) {
				// ����
				sum += 366;
			} else {
				// ƽ��
				sum += 365;
			}
		}
		// ���㵱ǰ�·ݵ�����
		for (int month = 1; month < months; month++) {
			if (month == 2) {
				if (years % 4 == 0 || years % 100 == 0) {
					sum += 29;
				} else {
					sum += 28;
				}
			} else {
				if (month == 4 || month == 6 || month == 9 || month == 11) {
					sum += 30;
				} else {
					sum += 31;
				}
			}
		}

		// ����1��λ��
		// sum += 1;
		// ������
		int weekday = sum % 7;
		System.out.println("��" + "\t" +"һ" + "\t" +"��" + "\t" +"��" + "\t" +"��" + "\t" +"��" + "\t" +"��" + "\t");
		for (int i = 1; i <= weekday; i++) {
			System.out.print("\t");
		}
		
		// ��������һ�����7������
		if (months == 2) {
			if (years % 4 == 0 || years % 100 == 0) {
				for (int i = 1; i <= 29; i++) {
					if (sum % 7 == 6) {
						System.out.print(i + "\n");
					} else {
						System.out.print(i + "\t");
					}
					sum +=1;
				}
			} else {
				for (int i = 1; i <= 28; i++) {
					if (sum % 7 == 6) {
						System.out.print(i + "\n");
					} else {
						System.out.print(i + "\t");
					}
					sum +=1;
				}
			}
		} else {
			if (months == 4 || months == 6 || months == 9 || months == 11) {
				for (int i = 1; i <= 30; i++) {
					if (sum % 7 == 6) {
						System.out.print(i + "\n");
					} else {
						System.out.print(i + "\t");
					}
					sum +=1;
				}
			} else {
				for (int i = 1; i <= 31; i++) {
					if (sum % 7 == 6) {
						System.out.print(i + "\n");
					} else {
						System.out.print(i + "\t");
					}
					sum +=1;
				}
			}
		}
		
		
	}

}
