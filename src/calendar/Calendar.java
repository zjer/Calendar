package calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("输入年份：");
		int years = sc.nextInt();
		System.out.print("输入月份：");
		int months = sc.nextInt();
		
		// 计算1900年到当前年份的天数
		int sum = 0;
		for (int year = 1900; year < years; year++) {
			if (year % 4 == 0 || year % 100 == 0) {
				// 闰年
				sum += 366;
			} else {
				// 平年
				sum += 365;
			}
		}
		// 计算当前月份的天数
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

		// 设置1号位置
		// sum += 1;
		// 设置周
		int weekday = sum % 7;
		System.out.println("日" + "\t" +"一" + "\t" +"二" + "\t" +"三" + "\t" +"四" + "\t" +"五" + "\t" +"六" + "\t");
		for (int i = 1; i <= weekday; i++) {
			System.out.print("\t");
		}
		
		// 设置日历一行最多7个数字
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
